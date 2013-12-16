package lanterns.blocks;

import lanterns.tileentities.TESpawner;
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
    public static Block blazespawn;
    public static Block creeperspawn;
    public static Block endermenspawn;
    public static Block skelespawn;
    public static Block spiderspawn;
    public static Block slimespawn;
    public static Block pigmenspawn;
    public static Block ghastspawn;
    public static Block witherskelespawn;
    public static Block magmaspawn;
    public static Block spawnstone;

    public static void init() {

        jackolantern = new BlockMobLantern(BlockIds.JACKOLANTERN_ID, BlockType.JACKO);
        GameRegistry.registerBlock(jackolantern, BlockIds.JACKOLANTERN_KEY);

        creeperlantern = new BlockMobLantern(BlockIds.CREEPER_ID, BlockType.CREEPER);
        GameRegistry.registerBlock(creeperlantern, (BlockIds.CREEPER_KEY));

        zombielantern = new BlockMobLantern(BlockIds.ZOMBIE_ID, BlockType.ZOMBIE);
        GameRegistry.registerBlock(zombielantern, BlockIds.ZOMBIE_KEY);

        skeletonlantern = new BlockMobLantern(BlockIds.SKELETON_ID, BlockType.SKELETON);
        GameRegistry.registerBlock(skeletonlantern, BlockIds.SKELETON_KEY);

        spiderlantern = new BlockMobLantern(BlockIds.SPIDER_ID, BlockType.SPIDER);
        GameRegistry.registerBlock(spiderlantern, BlockIds.SPIDER_KEY);

        slimelantern = new BlockMobLantern(BlockIds.SLIME_ID, BlockType.SLIME);
        GameRegistry.registerBlock(slimelantern, BlockIds.SLIME_KEY);

        endermenlantern = new BlockMobLantern(BlockIds.ENDERMEN_ID, BlockType.ENDERMEN);
        GameRegistry.registerBlock(endermenlantern, BlockIds.ENDERMEN_KEY);

        pigmenlantern = new BlockMobLantern(BlockIds.PIGMEN_ID, BlockType.PIGMEN);
        GameRegistry.registerBlock(pigmenlantern, BlockIds.PIGMEN_KEY);

        blazelantern = new BlockMobLantern(BlockIds.BLAZE_ID, BlockType.BLAZE);
        GameRegistry.registerBlock(blazelantern, BlockIds.BLAZE_KEY);

        magmacubelantern = new BlockMobLantern(BlockIds.MAGMA_ID, BlockType.MAGMA_CUBE);
        GameRegistry.registerBlock(magmacubelantern, BlockIds.MAGMA_KEY);

        witherskeletonlantern = new BlockMobLantern(BlockIds.WITHERSKELE_ID, BlockType.WITHER_SKELETON);
        GameRegistry.registerBlock(witherskeletonlantern, BlockIds.WITHERSKELE_KEY);

        ghastlantern = new BlockMobLantern(BlockIds.GHAST_ID, BlockType.GHAST);
        GameRegistry.registerBlock(ghastlantern, BlockIds.GHAST_KEY);

        zspawn = new BlockSpawner(BlockIds.ZSPAWN_ID, BlockType.ZOMBIESPAWN);
        GameRegistry.registerBlock(zspawn, BlockIds.ZSPAWN_KEY);

        blazespawn = new BlockSpawner(BlockIds.BLAZESPAWN_ID, BlockType.BLAZESPAWN);
        GameRegistry.registerBlock(blazespawn, BlockIds.BLAZESPAWN_KEY);

        creeperspawn = new BlockSpawner(BlockIds.CREEPERSPAWN_ID, BlockType.CREEPERSPAWN);
        GameRegistry.registerBlock(creeperspawn, BlockIds.CREEPERSPAWN_KEY);

        endermenspawn = new BlockSpawner(BlockIds.ENDERMENSPAWN_ID, BlockType.ENDERMENSPAWN);
        GameRegistry.registerBlock(endermenspawn, BlockIds.ENDERMENSPAWN_KEY);

        skelespawn = new BlockSpawner(BlockIds.SKELETONSPAWN_ID, BlockType.SKELETONSPAWN);
        GameRegistry.registerBlock(skelespawn, BlockIds.SKELETONSPAWN_KEY);

        spiderspawn = new BlockSpawner(BlockIds.SPIDERSPAWN_ID, BlockType.SPIDERSPAWN);
        GameRegistry.registerBlock(spiderspawn, BlockIds.SPIDERSPAWN_KEY);

        slimespawn = new BlockSpawner(BlockIds.SLIMESPAWN_ID, BlockType.SLIMESPAWN);
        GameRegistry.registerBlock(slimespawn, BlockIds.SLIMESPAWN_KEY);

        pigmenspawn = new BlockSpawner(BlockIds.PIGMENSPAWN_ID, BlockType.PIGMENSPAWN);
        GameRegistry.registerBlock(pigmenspawn, BlockIds.PIGMENSPAWN_KEY);

        ghastspawn = new BlockSpawner(BlockIds.GHASTSPAWN_ID, BlockType.GHASTSPAWN);
        GameRegistry.registerBlock(ghastspawn, BlockIds.GHASTSPAWN_KEY);

        witherskelespawn = new BlockSpawner(BlockIds.WITHERSKELESPAWN_ID, BlockType.WITHERSKELESPAWN);
        GameRegistry.registerBlock(witherskelespawn, BlockIds.WITHERSKELESPAWN_KEY);

        magmaspawn = new BlockSpawner(BlockIds.MAGMASPAWN_ID, BlockType.MAGMASPAWN);
        GameRegistry.registerBlock(magmaspawn, BlockIds.MAGMASPAWN_KEY);

        spawnstone = new SpawnStone(BlockIds.SPAWN_STONE_ID, Material.rock);
        GameRegistry.registerBlock(spawnstone, BlockIds.SPAWN_STONE_KEY);
    }

    public static void registerTileEntities() {
        GameRegistry.registerTileEntity(TESpawner.class, BlockIds.ZSPAWN_KEY);

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
        LanguageRegistry.addName(witherskeletonlantern, BlockIds.WITHERSKELE_NAME);
        LanguageRegistry.addName(ghastlantern, BlockIds.GHAST_NAME);
        LanguageRegistry.addName(zspawn, BlockIds.ZSPAWN_NAME);
        LanguageRegistry.addName(blazespawn, BlockIds.BLAZESPAWN_NAME);
        LanguageRegistry.addName(creeperspawn, BlockIds.CREEPERSPAWN_NAME);
        LanguageRegistry.addName(endermenspawn, BlockIds.ENDERMENSPAWN_NAME);
        LanguageRegistry.addName(ghastspawn, BlockIds.GHASTSPAWN_NAME);
        LanguageRegistry.addName(magmaspawn, BlockIds.MAGMASPAWN_NAME);
        LanguageRegistry.addName(pigmenspawn, BlockIds.PIGMENSPAWN_NAME);
        LanguageRegistry.addName(slimespawn, BlockIds.SLIMESPAWN_NAME);
        LanguageRegistry.addName(spiderspawn, BlockIds.SPIDERSPAWN_NAME);
        LanguageRegistry.addName(skelespawn, BlockIds.SKELETONSPAWN_NAME);
        LanguageRegistry.addName(witherskelespawn, BlockIds.WITHERSKELESPAWN_NAME);

    }

    public static void recipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.jackolantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Block.torchWood));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.creeperlantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Item.gunpowder));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.zombielantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Item.rottenFlesh));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.skeletonlantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Item.bone));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.spiderlantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Item.spiderEye));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.slimelantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Item.slimeBall));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.endermenlantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Item.enderPearl));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.pigmenlantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Item.goldNugget));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.blazelantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Item.blazePowder));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.magmacubelantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Item.magmaCream));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.witherskeletonlantern),
                new ItemStack(Block.pumpkinLantern), new ItemStack(Item.coal));
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ghastlantern), new ItemStack(Block.pumpkinLantern),
                new ItemStack(Item.ghastTear));

    }

}
