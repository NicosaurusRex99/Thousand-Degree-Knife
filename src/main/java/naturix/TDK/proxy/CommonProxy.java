package naturix.TDK.proxy;

import java.io.File;

import naturix.TDK.Config;
import naturix.TDK.FurnaceRecipes;
import naturix.TDK.items.HotKnife;
import naturix.TDK.items.IronKnife;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) 
	{
		File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "naturix/Thousand Degree Knife.cfg"));
        Config.readConfig();
            }

    public void init(FMLInitializationEvent e)
    {
    	FurnaceRecipes.init();
    }
    
    public void postInit(FMLPostInitializationEvent e) 
    {
    	if (config.hasChanged()) {
            config.save();

    }
    }
	@EventHandler 
	public void serverLoad(FMLServerStartingEvent event) 
	{

	}
		
		
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {

    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	event.getRegistry().register(new IronKnife());
    	event.getRegistry().register(new HotKnife());	
    }
    public void registerItemRenderer(Item item, int meta, String id) {

	}
}