package naturix.TDK.items;

import naturix.TDK.ThousandDegreeKnifeMod;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class IronKnife extends ItemSword {

    public IronKnife() {
    	super(ToolMaterial.IRON);
        this.setRegistryName("ironknife");
        this.setUnlocalizedName(ThousandDegreeKnifeMod.MODID + ".ironknife");
        setCreativeTab(ThousandDegreeKnifeMod.ThousandDegreeKnifeMod);
        setMaxStackSize(1);
        setMaxDamage(13000001);
        setHarvestLevel(getUnlocalizedName(), 1);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}