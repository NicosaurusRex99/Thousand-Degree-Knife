package naturix.TDK.registry;

import naturix.TDK.items.HotKnife;
import naturix.TDK.items.IronKnife;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems 
{
	@GameRegistry.ObjectHolder("thousanddegreeknife:ironknife")
    public static IronKnife ironknife;
	@GameRegistry.ObjectHolder("thousanddegreeknife:thousanddegreeknife")
    public static HotKnife hotknife;

	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
		ironknife.initModel();
		hotknife.initModel();
}
	public static void initOreDict() {
		
	}
}