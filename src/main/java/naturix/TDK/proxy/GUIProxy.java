package naturix.TDK.proxy;

import naturix.TDK.util.ContainerGui;
import naturix.TDK.util.ContainerTDK;
import naturix.TDK.util.TDKContainerTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GUIProxy implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof TDKContainerTileEntity) {
            return new ContainerTDK(player.inventory, (TDKContainerTileEntity) te);
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x, y, z);
        TileEntity te = world.getTileEntity(pos);
        if (te instanceof TDKContainerTileEntity) {
            TDKContainerTileEntity containerTileEntity = (TDKContainerTileEntity) te;
            return new ContainerGui(containerTileEntity, new ContainerTDK(player.inventory, containerTileEntity));
        }
        return null;
    }
}
