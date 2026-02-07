package net.mcreator.syndred.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.syndred.world.inventory.AnimaConfluxGUIMenu;
import net.mcreator.syndred.procedures.AnimaConfluxProgrState3Procedure;
import net.mcreator.syndred.procedures.AnimaConfluxProgrState2Procedure;
import net.mcreator.syndred.procedures.AnimaConfluxProgrState1Procedure;
import net.mcreator.syndred.procedures.AnimaConfluxProgrState0Procedure;
import net.mcreator.syndred.init.SyndredModScreens;

public class AnimaConfluxGUIScreen extends AbstractContainerScreen<AnimaConfluxGUIMenu> implements SyndredModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;

	public AnimaConfluxGUIScreen(AnimaConfluxGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 220;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("syndred:textures/screens/anima_conflux_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("syndred:textures/screens/soul_backround.png"), this.leftPos + 162, this.topPos + 10, 0, 0, 18, 84, 18, 84);
		if (AnimaConfluxProgrState0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("syndred:textures/screens/soul_progress_part.png"), this.leftPos + 164, this.topPos + 12, 0, 0, 13, 16, 13, 16);
		}
		if (AnimaConfluxProgrState1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("syndred:textures/screens/soul_progress_part.png"), this.leftPos + 164, this.topPos + 28, 0, 0, 13, 16, 13, 16);
		}
		if (AnimaConfluxProgrState2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("syndred:textures/screens/soul_progress_part.png"), this.leftPos + 164, this.topPos + 44, 0, 0, 13, 16, 13, 16);
		}
		if (AnimaConfluxProgrState3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("syndred:textures/screens/soul_progress_part.png"), this.leftPos + 164, this.topPos + 60, 0, 0, 13, 16, 13, 16);
		}
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("syndred:textures/screens/soul_progress_part.png"), this.leftPos + 164, this.topPos + 76, 0, 0, 13, 16, 13, 16);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("syndred:textures/screens/soul_notched_10_progress.png"), this.leftPos + 162, this.topPos + 10, 0, 0, 18, 84, 18, 84);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("syndred:textures/screens/echo_dust_placeholder.png"), this.leftPos + 162, this.topPos + 103, 0, 0, 16, 16, 16, 16);
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.syndred.anima_conflux_gui.label_anima_conflux"), 72, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}