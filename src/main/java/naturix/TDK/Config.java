package naturix.TDK;

import naturix.TDK.proxy.CommonProxy;
import net.minecraftforge.common.config.Configuration;

public class Config {
	private static final String CATEGORY_GENERAL = "general";
	public static int GuiId;

	
	public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        } catch (Exception e1) {
        } finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }
	 private static void initGeneralConfig(Configuration cfg) {
	        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General configuration");
	        cfg.getInt("guiId", CATEGORY_GENERAL, 0, 0, 100, "the ID of the brazier furnace GUI");
	 }
}