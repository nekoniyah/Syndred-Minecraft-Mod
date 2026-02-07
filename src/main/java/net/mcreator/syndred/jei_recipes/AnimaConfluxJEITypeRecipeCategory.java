package net.mcreator.syndred.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.NonNullList;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.syndred.init.SyndredModJeiPlugin;
import net.mcreator.syndred.init.SyndredModBlocks;

import mezz.jei.api.recipe.types.IRecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

import java.util.List;

public class AnimaConfluxJEITypeRecipeCategory implements IRecipeCategory<AnimaConfluxJEITypeRecipe> {
	public final static ResourceLocation UID = ResourceLocation.parse("syndred:anima_conflux_jei_type");
	public final static ResourceLocation TEXTURE = ResourceLocation.parse("syndred:textures/screens/anima_conflux_jei_bg.png");
	private final IDrawable background;
	private final IDrawable icon;

	private final Minecraft mc = Minecraft.getInstance();

	public AnimaConfluxJEITypeRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 200, 133);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(SyndredModBlocks.ANIMA_CONFLUX.get().asItem()));
	}

	@Override
	public IRecipeType<AnimaConfluxJEITypeRecipe> getRecipeType() {
		return SyndredModJeiPlugin.AnimaConfluxJEIType_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Anima Conflux JEI Type");
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public int getWidth() {
		return this.background.getWidth();
	}

	@Override
	public int getHeight() {
		return this.background.getHeight();
	}

	@Override
	public boolean needsRecipeBorder() {
		return false;
	}

	@Override
	public void draw(AnimaConfluxJEITypeRecipe recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
		this.background.draw(guiGraphics);
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, AnimaConfluxJEITypeRecipe recipe, IFocusGroup focuses) {
		List<ItemStack> recipeOutputs = recipe.getResultItems();
		List<ItemStack> actualOutputs = NonNullList.withSize(1, ItemStack.EMPTY);
		for (int i = 0; i < recipeOutputs.size(); i++) {
			actualOutputs.set(i, recipeOutputs.get(i));
		}
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 44).add(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 44).add(recipe.getIngredients().get(1));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 44).add(recipe.getIngredients().get(2));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 62).add(recipe.getIngredients().get(3));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 62).add(recipe.getIngredients().get(4));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 62).add(recipe.getIngredients().get(5));
		builder.addSlot(RecipeIngredientRole.INPUT, 37, 80).add(recipe.getIngredients().get(6));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 0).add(recipe.getIngredients().get(7));
		builder.addSlot(RecipeIngredientRole.INPUT, 73, 80).add(recipe.getIngredients().get(8));
		builder.addSlot(RecipeIngredientRole.INPUT, 55, 26).add(recipe.getIngredients().get(9));
		builder.addSlot(RecipeIngredientRole.INPUT, 91, 62).add(recipe.getIngredients().get(10));
		builder.addSlot(RecipeIngredientRole.INPUT, 56, 98).add(recipe.getIngredients().get(11));
		builder.addSlot(RecipeIngredientRole.INPUT, 19, 62).add(recipe.getIngredients().get(12));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 163, 44).add(actualOutputs.get(0));
	}
}