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

public class BlockSkeletonLantern extends BlockDirectional {
	public BlockSkeletonLantern(int id, Material material) {
		super(id, Material.pumpkin);
		this.setUnlocalizedName(BlockIds.SKELETON_UNLOCALIZED_NAME);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setLightValue(1F);
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

	@Override
	public void registerIcons(IconRegister register) {
		topIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":"
				+ BlockIds.SKELETONTOP);
		faceIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":"
				+ BlockIds.SKELETONFRONT);
		blockIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":"
				+ BlockIds.SKELETONSIDE);
		activeFaceIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":"
				+ BlockIds.SKELETONSIDEACTIVE);
	}

	public double isActive = 2;

	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int metadata) {
		if (side == 1)
			return this.topIcon;
		else if (side == 0)
			return this.topIcon;
		else if (metadata == 2 && side == 2 && isActive == 2)
			return this.faceIcon;
		else if (metadata == 3 && side == 5 && isActive == 2)
			return this.faceIcon;
		else if (metadata == 0 && side == 3 && isActive == 2)
			return this.faceIcon;
		else if (metadata == 1 && side == 4 && isActive == 2)
			return this.faceIcon;
		else if (metadata == 2 && side == 2 && isActive == 1)
			return this.activeFaceIcon;
		else if (metadata == 3 && side == 5 && isActive == 1)
			return this.activeFaceIcon;
		else if (metadata == 0 && side == 3 && isActive == 1)
			return this.activeFaceIcon;
		else if (metadata == 1 && side == 4 && isActive == 1)
			return this.activeFaceIcon;

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
			Minecraft.getMinecraft().sndManager.playSound("mob.skeleton.say",
					(float) x, (float) y, (float) z, (float) 1, (float) 1);
			isActive = 1;

		} else if (!world.isRemote && !state) {
			isActive = 2;

		}
	}
}
