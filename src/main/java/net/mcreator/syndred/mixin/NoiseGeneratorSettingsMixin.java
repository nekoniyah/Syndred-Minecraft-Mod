package net.mcreator.syndred.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.syndred.init.SyndredModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements SyndredModBiomes.SyndredModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> syndred_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.syndred_dimensionTypeReference != null) {
			retval = SyndredModBiomes.adaptSurfaceRule(retval, this.syndred_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setsyndredDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.syndred_dimensionTypeReference = dimensionType;
	}
}