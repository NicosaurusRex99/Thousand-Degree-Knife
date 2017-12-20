package naturix.TDK.registry;

import naturix.TDK.blocks.BrazierFurnace;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	@GameRegistry.ObjectHolder("thousanddegreeknife:brazierfurnace")
    public static BrazierFurnace brazierfurnace;

	
	@SideOnly(Side.CLIENT)
    public static void init() {
        brazierfurnace.initModel();

} 
	public static void initOreDict() {

	}


}