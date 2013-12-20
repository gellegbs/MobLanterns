package lanterns;

import lanterns.blocks.Blocks;
import lanterns.world.GenerationHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Lanterns {

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
    }

    @EventHandler
    public void load(FMLInitializationEvent event) {

        Blocks.init();
        Blocks.addNames();
        Blocks.recipes();
        Blocks.registerTileEntities();
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabMobLanterns", "en_US", "MobLanterns");
        new GenerationHandler();
    }

    public static CreativeTabs tabMobLanterns = new CreativeTabs("tabMobLanterns") {
        @Override
        public ItemStack getIconItemStack() {
            return new ItemStack(Blocks.skeletonlantern);
        }
    };
}
