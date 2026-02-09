package net.syndred.syndred.procedures;

import net.syndred.syndred.jei_recipes.AnimaConfluxJEITypeRecipe;
import net.syndred.syndred.init.SyndredModRecipeTypes;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import java.util.stream.Collectors;
import java.util.List;

public class AnimaConfluxOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double recipe_result_count = 0;
		ItemStack item = ItemStack.EMPTY;
		{
			List<AnimaConfluxJEITypeRecipe> recipes = null;
			if (world instanceof ServerLevel _lvl) {
				recipes = _lvl.recipeAccess().recipeMap().byType(AnimaConfluxJEITypeRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
			} else {
				recipes = SyndredModRecipeTypes.recipes.byType(AnimaConfluxJEITypeRecipe.Type.INSTANCE).stream().map(RecipeHolder::value).collect(Collectors.toList());
			}
			for (AnimaConfluxJEITypeRecipe recipe : recipes) {
				List<Ingredient> ingredients = recipe.getIngredients();
				if (!ingredients.get(0).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy())))
					continue;
				if (!ingredients.get(1).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy())))
					continue;
				if (!ingredients.get(2).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy())))
					continue;
				if (!ingredients.get(3).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy())))
					continue;
				if (!ingredients.get(4).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 4).copy())))
					continue;
				if (!ingredients.get(5).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 5).copy())))
					continue;
				if (!ingredients.get(6).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 6).copy())))
					continue;
				if (!ingredients.get(7).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 7).copy())))
					continue;
				if (!ingredients.get(8).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 8).copy())))
					continue;
				if (!ingredients.get(9).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 9).copy())))
					continue;
				if (!ingredients.get(10).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 10).copy())))
					continue;
				if (!ingredients.get(11).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 11).copy())))
					continue;
				if (!ingredients.get(12).test((itemFromBlockInventory(world, BlockPos.containing(x, y, z), 12).copy())))
					continue;
				List<ItemStack> reciperesult = recipe.getResultItems();
				for (ItemStack itemstack : reciperesult) {
					ItemStack itemstackiterator = itemstack.copy();
					recipe_result_count = recipe_result_count + 1;
					item = itemstackiterator.copy();
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = item.copy();
					_setstack.setCount((int) recipe_result_count);
					_itemHandlerModifiable.setStackInSlot(13, _setstack);
				}
				recipe_result_count = 0;
				break;
			}
		}
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}