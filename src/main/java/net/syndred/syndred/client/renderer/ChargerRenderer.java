package net.syndred.syndred.client.renderer;

import net.syndred.syndred.entity.ChargerEntity;
import net.syndred.syndred.client.model.Modelcharger;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ChargerRenderer extends MobRenderer<ChargerEntity, LivingEntityRenderState, Modelcharger> {
	private ChargerEntity entity = null;

	public ChargerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcharger(context.bakeLayer(Modelcharger.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ChargerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		if (entity != null)
			return ResourceLocation.parse("syndred:textures/entities/" + entity.getTexture() + ".png");
		return ResourceLocation.parse("syndred:textures/entities/charger.png");
	}
}