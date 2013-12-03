package lanterns.blocks;

import lanterns.Lanterns;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockZSpawn extends Block {

	public BlockZSpawn(int par1, Material par2Material) {
		super(par1, Material.rock);
		this.setCreativeTab(Lanterns.tabMobLanterns);
		this.setUnlocalizedName(BlockIds.ZSPAWN_UNLOCALIZED_NAME);
	}

	@Override
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(BlockIds.TEXTURE_LOCATION + ":"
				+ BlockIds.ZSPAWN_TEXTURE);

	}
	/*
	 * @Override public void onNeighborBlockChange(World world, int x, int y,
	 * int z, int par5) { if (!world.isRemote) { this.updateBlock(world, x, y,
	 * z); } }
	 * 
	 * @Override public void onBlockAdded(World world, int x, int y, int z) { if
	 * (!world.isRemote) { this.updateBlock(world, x, y, z); } }
	 * 
	 * public void updateBlock(World world, int x, int y, int z) {
	 * 
	 * boolean state = world.isBlockIndirectlyGettingPowered(x, y, z); if
	 * (!world.isRemote && state) { ; Entity entity =
	 * EntityList.createEntityByID(54, world);
	 * 
	 * } }
	 */

}
