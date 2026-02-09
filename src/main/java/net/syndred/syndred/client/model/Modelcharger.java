package net.syndred.syndred.client.model;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcharger extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("syndred", "modelcharger"), "main");
	public final ModelPart head;
	public final ModelPart tail;
	public final ModelPart body;
	public final ModelPart legs;
	public final ModelPart leg1;
	public final ModelPart leg3;
	public final ModelPart leg2;
	public final ModelPart leg4;

	public Modelcharger(ModelPart root) {
		super(root);
		this.head = root.getChild("head");
		this.tail = root.getChild("tail");
		this.body = root.getChild("body");
		this.legs = root.getChild("legs");
		this.leg1 = this.legs.getChild("leg1");
		this.leg3 = this.legs.getChild("leg3");
		this.leg2 = this.legs.getChild("leg2");
		this.leg4 = this.legs.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(30, 35).addBox(-3.5F, -5.1317F, -4.8745F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(30, 22)
				.addBox(-4.0F, -5.6317F, -5.3745F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(1, 1).addBox(-2.0F, -0.6F, -5.875F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.1317F, -5.1255F));
		PartDefinition hornbumpL_r1 = head.addOrReplaceChild("hornbumpL_r1",
				CubeListBuilder.create().texOffs(44, 49).addBox(-2.2241F, -7.4005F, -4.0457F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 55).addBox(-1.7241F, -9.9005F, -3.7957F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.942F, -1.0374F, -0.7459F, -0.274F, -0.2849F));
		PartDefinition Lhorntip_r1 = head.addOrReplaceChild("Lhorntip_r1",
				CubeListBuilder.create().texOffs(44, 55).addBox(-5.4066F, -10.5047F, -3.8134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 55).addBox(4.4066F, -10.5047F, -3.8134F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.942F, -1.0374F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Chorn_r1 = head.addOrReplaceChild("Chorn_r1",
				CubeListBuilder.create().texOffs(24, 43).addBox(-0.5F, -12.6298F, 0.4376F, 1.0F, 4.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 49).addBox(-1.0F, -8.1023F, 0.02F, 2.0F, 2.5F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.942F, -1.0374F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Rhorn_r1 = head.addOrReplaceChild("Rhorn_r1",
				CubeListBuilder.create().texOffs(52, 54).addBox(0.7241F, -9.9005F, -3.7957F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 49).addBox(0.2241F, -7.4005F, -4.0457F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.942F, -1.0374F, -0.7459F, 0.274F, 0.2849F));
		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 9.2081F, 8.8523F, 0.0F, 0.0436F, 0.0F));
		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(44, 14).addBox(-1.5F, -2.2071F, -4.6213F, 3.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.5F, 0.25F, -1.0F, 2.8798F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 8.6265F, -0.8142F));
		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 22).addBox(-4.5F, -7.5F, -3.0F, 9.0F, 15.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5817F, 1.6665F, 1.5708F, 0.0F, 0.0F));
		PartDefinition bodyfloof_r1 = body.addOrReplaceChild("bodyfloof_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -6.0835F, -10.0817F, 10.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition legs = partdefinition.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(-2.0F, 13.5F, 6.0F));
		PartDefinition leg1 = legs.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(24, 49).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg3 = legs.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 43).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -10.5F));
		PartDefinition leg2 = legs.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(44, 0).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 0.0F));
		PartDefinition leg4 = legs.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(12, 43).addBox(-1.5F, -0.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, -10.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}