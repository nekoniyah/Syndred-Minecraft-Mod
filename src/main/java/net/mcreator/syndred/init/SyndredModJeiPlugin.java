package net.mcreator.syndred.init;

import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.syndred.jei_recipes.AnimaConfluxJEITypeRecipeCategory;
import net.mcreator.syndred.jei_recipes.AnimaConfluxJEITypeRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.recipe.types.IRecipeType;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.stream.Collectors;
import java.util.List;

@JeiPlugin
public class SyndredModJeiPlugin implements IModPlugin {
	public static IRecipeType<AnimaConfluxJEITypeRecipe> AnimaConfluxJEIType_Type = IRecipeType.create(AnimaConfluxJEITypeRecipeCategory.UID, AnimaConfluxJEITypeRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return ResourceLocation.parse("syndred:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new AnimaConfluxJEITypeRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		List<AnimaConfluxJEITypeRecipe> AnimaConfluxJEITypeRecipes = SyndredModRecipeTypes.recipes.byType(AnimaConfluxJEITypeRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
		registration.addRecipes(AnimaConfluxJEIType_Type, AnimaConfluxJEITypeRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
	}
}