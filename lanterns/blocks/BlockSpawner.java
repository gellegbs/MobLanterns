package lanterns.blocks;

import lanterns.Lanterns;
import lanterns.tileentities.TESpawner;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSpawner extends BlockContainer {

    private BlockType type;

    public BlockSpawner(int par1, BlockType type) {
        super(par1, Material.rock);
        this.type = type;
        this.setCreativeTab(Lanterns.tabMobLanterns);
        this.setUnlocalizedName(BlockIds.ZSPAWN_UNLOCALIZED_NAME);
    }

    // icon junk

    @SideOnly(Side.CLIENT)
    private Icon topIcon;
    @SideOnly(Side.CLIENT)
    private Icon faceIcon;
    @SideOnly(Side.CLIENT)
    private Icon blockIcon;
    @SideOnly(Side.CLIENT)
    private Icon activeFaceIcon;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister register) {
        topIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":" + type.textureTop);
        faceIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":" + type.textureFront);
        blockIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":" + type.textureSide);
        activeFaceIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":" + type.textureSideActive);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int metadata) {

        if (side == 0 || side == 1) {
            return this.topIcon;
        }

        // metadata holds the block side with the face on in the lower 3 bits
        // (0xxx),
        // and if its active or not in the highest bit. (x000)
        if ((metadata & 7) == side) {
            boolean isActive = (metadata & 8) > 0;
            return (isActive) ? this.activeFaceIcon : this.faceIcon;
        }

        return this.blockIcon;
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int par5) {
        if (!world.isRemote) {
            this.updateBlock(world, x, y, z, world.getBlockMetadata(x, y, z));
        }
    }

    @Override
    public void onBlockAdded(World world, int x, int y, int z) {
        if (!world.isRemote) {
            this.updateBlock(world, x, y, z, world.getBlockMetadata(x, y, z));
        }
    }

    // spawner stuff
    private int maxUses = 100;

    public void updateBlock(World world, int x, int y, int z, int currentMeta) {
        if (!world.isRemote) {
            boolean isActive = (currentMeta & 8) > 0;
            boolean redstoneSignal = world.isBlockIndirectlyGettingPowered(x, y, z);

            if (redstoneSignal) {
                if (!isActive) {
                    if (type.spawnerid != 0 && maxUses != 0) {
                        EntityList.createEntityByID(BlockType.spawnerid, world);
                        maxUses--;
                    }
                    currentMeta = (currentMeta & 7) + 8;
                    world.setBlockMetadataWithNotify(x, y, z, currentMeta, 2);
                }
            } else {
                if (isActive || maxUses == 0) {
                    world.setBlockMetadataWithNotify(x, y, z, (currentMeta & 7), 2);
                }
            }
        }
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TESpawner();

    }

}
