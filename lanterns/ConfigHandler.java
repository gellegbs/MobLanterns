package lanterns;

import java.io.File;

import lanterns.blocks.BlockIds;
import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	 public static void init(File file){
	        Configuration config = new Configuration(file);
	        
	        config.load();
	       
	        BlockIds.BLAZE_ID = config.getBlock(BlockIds.BLAZE_KEY,  BlockIds.BLAZE_DEFAULT).getInt();
	        BlockIds.CREEPER_ID = config.getBlock(BlockIds.CREEPER_KEY, BlockIds.CREEPER_DEFAULT).getInt();
	        BlockIds.ENDERMEN_ID = config.getBlock(BlockIds.ENDERMEN_KEY, BlockIds.ENDERMEN_DEFAULT).getInt();
	        BlockIds.GHAST_ID = config.getBlock(BlockIds.GHAST_KEY, BlockIds.GHAST_DEFAULT).getInt();
	        BlockIds.JACOLANTERN_ID = config.getBlock(BlockIds.JACKOLANTERN_KEY, BlockIds.JACKOLANTERN_DEFAULT).getInt();
	        BlockIds.MAGMA_ID = config.getBlock(BlockIds.MAGMA_KEY, BlockIds.MAGMA_DEFAULT).getInt();
	        BlockIds.PIGMEN_ID = config.getBlock(BlockIds.PIGMEN_KEY, BlockIds.PIGMEN_DEFAULT).getInt();
	        BlockIds.SKELETON_ID = config.getBlock(BlockIds.SKELETON_KEY, BlockIds.SKELETON_DEFAULT).getInt();
	        BlockIds.SLIME_ID = config.getBlock(BlockIds.SLIME_KEY, BlockIds.SLIME_DEFAULT).getInt();
	        BlockIds.SPIDER_ID = config.getBlock(BlockIds.SPIDER_KEY, BlockIds.SPIDER_DEFAULT).getInt();
	        BlockIds.WITHERSKELE_ID = config.getBlock(BlockIds.WITHERSKELE_KEY, BlockIds.WITHERSKELE_DEFAULT).getInt();
	        BlockIds.ZOMBIE_ID = config.getBlock(BlockIds.ZOMBIE_KEY, BlockIds.ZOMBIE_DEFAULT).getInt();
	       
	        config.save();
	    }
}
