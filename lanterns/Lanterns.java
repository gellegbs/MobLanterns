package lanterns;

import lanterns.blocks.BlockJackolantern;
import lanterns.blocks.Blocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Lanterns {
	
public static final String modid = "lanterns";

@EventHandler
public void preInit(FMLPreInitializationEvent event){
	ConfigHandler.init(event.getSuggestedConfigurationFile());
}

@EventHandler
public void load(FMLInitializationEvent event){
	
	Blocks.init();
	Blocks.addNames();
	Blocks.recipes();
	}

}
