package net.syndred.syndred.init;

import net.syndred.syndred.jei_recipes.AnimaConfluxJEITypeRecipe;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.OnDatapackSyncEvent;
import net.neoforged.neoforge.client.event.RecipesReceivedEvent;
import net.neoforged.neoforge.client.event.ClientPlayerNetworkEvent;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeMap;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber
public class SyndredModRecipeTypes {
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(BuiltInRegistries.RECIPE_TYPE, "syndred");
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(BuiltInRegistries.RECIPE_SERIALIZER, "syndred");
	public static RecipeMap recipes = null;

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = ModList.get().getModContainerById("syndred").get().getEventBus();
		event.enqueueWork(() -> {
			RECIPE_TYPES.register(bus);
			SERIALIZERS.register(bus);
			RECIPE_TYPES.register("anima_conflux_jei_type", () -> AnimaConfluxJEITypeRecipe.Type.INSTANCE);
			SERIALIZERS.register("anima_conflux_jei_type", () -> AnimaConfluxJEITypeRecipe.Serializer.INSTANCE);
		});
	}

	@SubscribeEvent
	public static void syncRecipes(OnDatapackSyncEvent event) {
		event.sendRecipes(AnimaConfluxJEITypeRecipe.Type.INSTANCE);
	}

	@EventBusSubscriber(value = Dist.CLIENT)
	public static class RecipeReceiver {
		@SubscribeEvent
		public static void receiveRecipes(RecipesReceivedEvent event) {
			recipes = event.getRecipeMap();
		}

		@SubscribeEvent
		public static void clearRecipes(ClientPlayerNetworkEvent.LoggingOut event) {
			recipes = null;
		}
	}
}