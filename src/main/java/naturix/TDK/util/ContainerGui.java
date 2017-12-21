package naturix.TDK.util;

import naturix.TDK.ThousandDegreeKnifeMod;
import naturix.TDK.blocks.BrazierFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public class ContainerGui extends GuiContainer {
    public static final int WIDTH = 180;
    public static final int HEIGHT = 152;
    
    private static final ResourceLocation background = new ResourceLocation(ThousandDegreeKnifeMod.MODID, "textures/gui/container.png");

    public ContainerGui(TDKContainerTileEntity containerTileEntity, ContainerTDK container) {
        super(container);

        xSize = WIDTH;
        ySize = HEIGHT;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(background);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
    }
}