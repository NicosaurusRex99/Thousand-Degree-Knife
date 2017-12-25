package naturix.TDK;

import naturix.TDK.registry.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipes {

	public static void init() 
{
	GameRegistry.addSmelting(ModItems.ironknife, new ItemStack(ModItems.hotknife), 0f);
}
}