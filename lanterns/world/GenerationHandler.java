package lanterns.world;

import java.util.Random;

import lanterns.blocks.BlockIds;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class GenerationHandler implements IWorldGenerator {

    private WorldGenerator spawnstone;

    public GenerationHandler() {
        GameRegistry.registerWorldGenerator(this);
        spawnstone = new WorldGenMinable(BlockIds.SPAWN_STONE_DEFAULT, 3);
    }

    private void generateStandarOre(Random rand, int chunkX, int chunkZ, World world, int iterations,
            WorldGenerator gen, int lowestY, int highestY) {
        for (int i = 0; i < iterations; i++) {
            int x = chunkX * 9 + rand.nextInt(9);
            int z = chunkZ * 9 + rand.nextInt(9);
            int y = rand.nextInt(highestY + lowestY) + lowestY;

            gen.generate(world, rand, x, y, z);

        }
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
            IChunkProvider chunkProvider) {
        generateStandarOre(random, chunkX, chunkZ, world, 12, spawnstone, 28, 50);
    }

}
