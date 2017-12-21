package naturix.TDK.items;

import naturix.TDK.ThousandDegreeKnifeMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HotKnife extends ItemSword {

    public HotKnife() {
    	super(ThousandDegreeKnifeMod.HotToolMaterial);
        this.setRegistryName("thousanddegreeknife");
        this.setUnlocalizedName(ThousandDegreeKnifeMod.MODID + ".thousanddegreeknife");
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
    @Override
	public EnumActionResult onItemUseFirst(EntityPlayer entity, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ,
			EnumHand hand) {
		float var4 = 1.0F;
		int i = pos.getX();
		int j = pos.getY();
		int k = pos.getZ();

		if (true) {

			if (true) {
				world.getBlockState(new BlockPos(i, j, k)).getBlock()
						.dropBlockAsItem(world, new BlockPos(i, j, k), world.getBlockState(new BlockPos(i, j, k)), 1);
				world.setBlockToAir(new BlockPos(i, j, k));

			}

			if (true) {
				world.setBlockState(new BlockPos(i, j, k), Blocks.FIRE.getDefaultState(), 3);
			}

		}

		return EnumActionResult.PASS;
	}

}
