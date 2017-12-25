package naturix.TDK.items;

import naturix.TDK.ThousandDegreeKnifeMod;
import naturix.TDK.registry.ModItems;
import naturix.TDK.registry.TileEntityCustom;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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
