/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.syndred.syndred.init;

import net.syndred.syndred.client.gui.SunderGUIScreen;
import net.syndred.syndred.client.gui.EggIncubatorGUIScreen;
import net.syndred.syndred.client.gui.AnimaConfluxGUIScreen;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class SyndredModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(SyndredModMenus.SUNDER_GUI.get(), SunderGUIScreen::new);
		event.register(SyndredModMenus.ANIMA_CONFLUX_GUI.get(), AnimaConfluxGUIScreen::new);
		event.register(SyndredModMenus.EGG_INCUBATOR_GUI.get(), EggIncubatorGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}