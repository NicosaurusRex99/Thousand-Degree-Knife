package naturix.TDK.proxy;

import java.io.File;

import naturix.TDK.Config;
import naturix.TDK.blocks.BrazierFurnace;
import naturix.TDK.registry.ModBlocks;
import naturix.TDK.registry.TileEntityCustom;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
    	ModBlocks.init();
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
    	event.getRegistry().register(new BrazierFurnace());

    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	event.getRegistry().register(new ItemBlock(ModBlocks.brazierfurnace).setRegistryName(ModBlocks.brazierfurnace.getRegistryName()));
    }
}