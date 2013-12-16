package lanterns.blocks;

import lanterns.Lanterns;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SpawnStone extends Block {

	public SpawnStone(int id, Material material) {
		super(id, Material.rock);
		this.setCreativeTab(Lanterns.tabMobLanterns);
		this.setUnlocalizedName(BlockIds.SPAWN_STONE_UNLOCALIZED_NAME);
	}

}
