/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.syndred.syndred.init;

import net.syndred.syndred.client.model.Modelcharger;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class SyndredModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcharger.LAYER_LOCATION, Modelcharger::createBodyLayer);
	}
}