package lanterns.blocks;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockWitherSkeletonLantern extends BlockDirectional {
	public BlockWitherSkeletonLantern(int id, Material material) {
		super(id, Material.pumpkin);
		this.setUnlocalizedName(BlockIds.WITHERSKELE_UNLOCALIZED_NAME);
		this.setLightValue(1F);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

	// icon junk

	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon faceIcon;
	@SideOnly(Side.CLIENT)
	private Icon blockIcon;

	@Override
	public void registerIcons(IconRegister register) {
		topIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":"
				+ BlockIds.WITHERSKELETOP);
		faceIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":"
				+ BlockIds.WITHERSKELEFRONT);
		blockIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":"
				+ BlockIds.WITHERSKELESIDE);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int metadata) {
		if (side == 1)
			return this.topIcon;
		else if (side == 0)
			return this.topIcon;
		else if (metadata == 2 && side == 2)
			return this.faceIcon;
		else if (metadata == 3 && side == 5)
			return this.faceIcon;
		else if (metadata == 0 && side == 3)
			return this.faceIcon;
		else if (metadata == 1 && side == 4)
			return this.faceIcon;
		else
			return this.blockIcon;
	}

	public void onBlockPlacedBy(World par1World, int x, int y, int z,
			EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack) {
		int whichDirectionFacing = MathHelper
				.floor_double((double) (par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
		par1World.setBlockMetadataWithNotify(x, y, z, whichDirectionFacing, 2);
	}

	@Override
	public void onNeighborBlockChange(World world, int x, int y, int z, int par5) {
		if (!world.isRemote) {
			this.updateBlock(world, x, y, z);
		}
	}

	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		if (!world.isRemote) {
			this.updateBlock(world, x, y, z);
		}
	}

	public void updateBlock(World world, int x, int y, int z) {
		boolean state = world.isBlockIndirectlyGettingPowered(x, y, z);
		if (!world.isRemote && state) {
			Minecraft.getMinecraft().sndManager.playSound("mob.skeleton.step",
					(float) x, (float) y, (float) z, (float) 1, (float) 1);
		}
	}
}
