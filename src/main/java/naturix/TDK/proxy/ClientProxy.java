package naturix.TDK.proxy;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
   
	public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }
	public void Init(FMLInitializationEvent e) {
		}
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        }
    

}