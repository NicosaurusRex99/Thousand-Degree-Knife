package naturix.TDK;

import naturix.TDK.proxy.CommonProxy;
import naturix.TDK.registry.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = ThousandDegreeKnifeMod.MODID, version = ThousandDegreeKnifeMod.VERSION, name = ThousandDegreeKnifeMod.MOD_NAME)
public class ThousandDegreeKnifeMod
{
	public static final Item.ToolMaterial HotToolMaterial = EnumHelper.addToolMaterial("HotKnife", 99, 6142, 321, 844, 50);
    public static final String MODID = "thousanddegreeknife";
    public static final String VERSION = "1.12.2.0";
    public static final String MOD_NAME = "Thousand Degree Knife";
    @SidedProxy(clientSide = "naturix.TDK.proxy.ClientProxy", serverSide = "naturix.TDK.proxy.ServerProxy")
    public static CommonProxy proxy;
    
    @Instance("thousanddegreeknife")
    public static ThousandDegreeKnifeMod instance;
 

    public static org.apache.logging.log4j.Logger logger;
    

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	logger = event.getModLog();
        proxy.preInit(event);
            }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
        
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {

    }
    
    public static final CreativeTabs ThousandDegreeKnifeMod = new CreativeTabs("ThousandDegreeKnifeMod")
    {

        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItems.hotknife);
        }
		
    };
}