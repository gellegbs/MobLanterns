package lanterns.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {

	public static Block jackolantern;
	public static Block creeperlantern;
	public static Block zombielantern;
	public static Block skeletonlantern;
	public static Block spiderlantern;
	public static Block slimelantern;
	public static Block endermenlantern;
	public static Block pigmenlantern;
	public static Block blazelantern;
	public static Block magmacubelantern;
	public static Block witherskeletonlantern;
	public static Block ghastlantern;
	public static Block zspawn;

	public static void init() {

		jackolantern = new BlockMobLantern(BlockIds.JACKOLANTERN_ID, LanternType.JACKO);
		GameRegistry.registerBlock(jackolantern, BlockIds.JACKOLANTERN_KEY);

		creeperlantern = new BlockMobLantern(BlockIds.CREEPER_ID, LanternType.CREEPER);
		GameRegistry.registerBlock(creeperlantern, (BlockIds.CREEPER_KEY));

		zombielantern = new BlockMobLantern(BlockIds.ZOMBIE_ID, LanternType.ZOMBIE);
		GameRegistry.registerBlock(zombielantern, BlockIds.ZOMBIE_KEY);

		skeletonlantern = new BlockMobLantern(BlockIds.SKELETON_ID, LanternType.SKELETON);
		GameRegistry.registerBlock(skeletonlantern, BlockIds.SKELETON_KEY);

		spiderlantern = new BlockMobLantern(BlockIds.SPIDER_ID, LanternType.SPIDER);
		GameRegistry.registerBlock(spiderlantern, BlockIds.SPIDER_KEY);

		slimelantern = new BlockMobLantern(BlockIds.SLIME_ID, LanternType.SLIME);
		GameRegistry.registerBlock(slimelantern, BlockIds.SLIME_KEY);

		endermenlantern = new BlockMobLantern(BlockIds.ENDERMEN_ID, LanternType.ENDERMEN);
		GameRegistry.registerBlock(endermenlantern, BlockIds.ENDERMEN_KEY);

		pigmenlantern = new BlockMobLantern(BlockIds.PIGMEN_ID, LanternType.PIGMEN);
		GameRegistry.registerBlock(pigmenlantern, BlockIds.PIGMEN_KEY);

		blazelantern = new BlockMobLantern(BlockIds.BLAZE_ID, LanternType.BLAZE);
		GameRegistry.registerBlock(blazelantern, BlockIds.BLAZE_KEY);

		magmacubelantern = new BlockMobLantern(BlockIds.MAGMA_ID, LanternType.MAGMA_CUBE);
		GameRegistry.registerBlock(magmacubelantern, BlockIds.MAGMA_KEY);

		witherskeletonlantern = new BlockMobLantern(BlockIds.WITHERSKELE_ID, LanternType.WITHER_SKELETON);
		GameRegistry.registerBlock(witherskeletonlantern,
				BlockIds.WITHERSKELE_KEY);

		ghastlantern = new BlockMobLantern(BlockIds.GHAST_ID, LanternType.GHAST);
		GameRegistry.registerBlock(ghastlantern, BlockIds.GHAST_KEY);

		zspawn = new BlockZSpawn(BlockIds.ZSPAWN_ID, Material.rock);
		GameRegistry.registerBlock(zspawn, BlockIds.ZSPAWN_KEY);
	}

	public static void addNames() {
		LanguageRegistry.addName(jackolantern, BlockIds.JACKOLANTERN_NAME);
		LanguageRegistry.addName(creeperlantern, BlockIds.CREEPER_NAME);
		LanguageRegistry.addName(zombielantern, BlockIds.ZOMBIE_NAME);
		LanguageRegistry.addName(skeletonlantern, BlockIds.SKELETON_NAME);
		LanguageRegistry.addName(spiderlantern, BlockIds.SPIDER_NAME);
		LanguageRegistry.addName(slimelantern, BlockIds.SLIME_NAME);
		LanguageRegistry.addName(endermenlantern, BlockIds.ENDERMEN_NAME);
		LanguageRegistry.addName(pigmenlantern, BlockIds.PIGMEN_NAME);
		LanguageRegistry.addName(blazelantern, BlockIds.BLAZE_NAME);
		LanguageRegistry.addName(magmacubelantern, BlockIds.MAGMA_NAME);
		LanguageRegistry.addName(witherskeletonlantern,
				BlockIds.WITHERSKELE_NAME);
		LanguageRegistry.addName(ghastlantern, BlockIds.GHAST_NAME);
		LanguageRegistry.addName(zspawn, BlockIds.ZSPAWN_NAME);
	}

	public static void recipes() {
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.jackolantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(
						Block.torchWood));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.creeperlantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(
						Item.gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.zombielantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(
						Item.rottenFlesh));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.skeletonlantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(Item.bone));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.spiderlantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(
						Item.spiderEye));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.slimelantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(
						Item.slimeBall));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.endermenlantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(
						Item.enderPearl));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.pigmenlantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(
						Item.goldNugget));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blazelantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(
						Item.blazePowder));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.magmacubelantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(
						Item.magmaCream));
		GameRegistry.addShapelessRecipe(new ItemStack(
				Blocks.witherskeletonlantern), new ItemStack(
				Block.pumpkinLantern), new ItemStack(Item.coal));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ghastlantern),
				new ItemStack(Block.pumpkinLantern), new ItemStack(
						Item.ghastTear));

	}

}
