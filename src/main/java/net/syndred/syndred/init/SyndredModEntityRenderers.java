/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.syndred.syndred.init;

import net.syndred.syndred.client.renderer.ChargerRenderer;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class SyndredModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SyndredModEntities.CHARGER.get(), ChargerRenderer::new);
	}
}