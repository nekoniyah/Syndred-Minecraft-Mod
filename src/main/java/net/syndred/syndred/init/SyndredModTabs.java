/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.syndred.syndred.init;

import net.syndred.syndred.SyndredMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

@EventBusSubscriber
public class SyndredModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SyndredMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SYNDRED_TAB = REGISTRY.register("syndred_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.syndred.syndred_tab")).icon(() -> new ItemStack(SyndredModBlocks.ANIMA_CONFLUX.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SyndredModItems.RAW_SOULSTEEL.get());
				tabData.accept(SyndredModBlocks.ANIMA_CONFLUX.get().asItem());
				tabData.accept(SyndredModBlocks.DEEPSLATE_SPHALERITE_ORE.get().asItem());
				tabData.accept(SyndredModBlocks.SPHALERITE_ORE.get().asItem());
				tabData.accept(SyndredModItems.RAW_SPHALERITE.get());
				tabData.accept(SyndredModItems.SOULSTEEL_INGOT.get());
				tabData.accept(SyndredModItems.SPHALERITE_INGOT.get());
				tabData.accept(SyndredModBlocks.RAW_SOULSTEEL_BLOCK.get().asItem());
				tabData.accept(SyndredModBlocks.RAW_SPHALERITE_BLOCK.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSTEEL_ORE.get().asItem());
				tabData.accept(SyndredModBlocks.DEEPSLATE_SOULSTEEL_ORE.get().asItem());
				tabData.accept(SyndredModItems.ECHO_DUST.get());
				tabData.accept(SyndredModItems.SOULSTEEL_SHARD.get());
				tabData.accept(SyndredModItems.SOULSTEEL_SWORD.get());
				tabData.accept(SyndredModItems.SOULSTEEL_PICKAXE.get());
				tabData.accept(SyndredModItems.SOULSTEEL_AXE.get());
				tabData.accept(SyndredModItems.SOULSTEEL_HOE.get());
				tabData.accept(SyndredModBlocks.DRY_STONE.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSTEEL_BLOCK.get().asItem());
				tabData.accept(SyndredModBlocks.SPHALERITE_BLOCK.get().asItem());
				tabData.accept(SyndredModItems.CHARGER_SPAWN_EGG.get());
				tabData.accept(SyndredModItems.HORN_LANCE.get());
				tabData.accept(SyndredModBlocks.EGG_INCUBATOR.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSHIRE_LOG.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSHIRE_LEAVES.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSHIRE_SAPLING.get().asItem());
				tabData.accept(SyndredModItems.SOUL_SHIRE_FRUIT.get());
				tabData.accept(SyndredModBlocks.SOULSHIRE_WOOD.get().asItem());
				tabData.accept(SyndredModBlocks.STRIPPED_SOULSHIRE_LOG.get().asItem());
				tabData.accept(SyndredModBlocks.STRIPPED_SOULSHIRE_WOOD.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONEBRICKS.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_BRICKS.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_POLISHED.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONE_POLISHED.get().asItem());
				tabData.accept(SyndredModBlocks.SMALL_DRY_STONEBRICKS.get().asItem());
				tabData.accept(SyndredModBlocks.LARGE_DRY_STONEBRICKS.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_CHISELED.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONE_STAIRS.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONE_WALL.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONE_SLAB.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_STAIRS.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_SLABS.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_WALL.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONEBRICKS_STAIRS.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONEBRICKS_SLABS.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONEBRICKS_WALL.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONE_POLISHED_STAIRS.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONE_POLISHED_SLAB.get().asItem());
				tabData.accept(SyndredModBlocks.DRY_STONE_POLISHEDWALL.get().asItem());
				tabData.accept(SyndredModBlocks.SMALL_DRY_STONEBRICK_STAIRS.get().asItem());
				tabData.accept(SyndredModBlocks.SMALL_DRY_STONEBRICK_SLAB.get().asItem());
				tabData.accept(SyndredModBlocks.SMALL_DRY_STONEBRICK_WALL.get().asItem());
				tabData.accept(SyndredModBlocks.LARGE_DRY_STONEBRICK_STAIRS.get().asItem());
				tabData.accept(SyndredModBlocks.LARGE_DRY_STONEBRICK_SLAB.get().asItem());
				tabData.accept(SyndredModBlocks.LARGE_DRY_STONEBRICK_WALL.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_BRICK_STAIRS.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_BRICK_SLAB.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_BRICKWALL.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_POLISHED_STAIRS.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_POLISHED_WALL.get().asItem());
				tabData.accept(SyndredModBlocks.HARSH_STONE_POLISHED_SLAB.get().asItem());
				tabData.accept(SyndredModItems.LEATHER_SOULSTEEL_HELMET.get());
				tabData.accept(SyndredModItems.LEATHER_SOULSTEEL_CHESTPLATE.get());
				tabData.accept(SyndredModItems.LEATHER_SOULSTEEL_LEGGINGS.get());
				tabData.accept(SyndredModItems.LEATHER_SOULSTEEL_BOOTS.get());
				tabData.accept(SyndredModBlocks.SCARLET_BLOSSOM.get().asItem());
				tabData.accept(SyndredModItems.MIDNIGHT_INGOT.get());
				tabData.accept(SyndredModItems.MIDNIGHT_SWORD.get());
				tabData.accept(SyndredModItems.MIDNIGHT_PICKAXE.get());
				tabData.accept(SyndredModItems.MIDNIGHT_HOE.get());
				tabData.accept(SyndredModItems.MIDNIGHT_SHOVEL.get());
				tabData.accept(SyndredModItems.MIDNIGHT_AXE.get());
				tabData.accept(SyndredModItems.SOULSTEEL_SHOVEL.get());
				tabData.accept(SyndredModBlocks.SOULSHIRE_STAIRS.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSHIRE_SLAB.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSHIRE_DOOR.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSHIRE_BUTTON.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSHIRE_PRESSURE_PLATE.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSHIRE_FENCE_GATE.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSHIRE_FENCE.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSHIRE_TRAPDOOR.get().asItem());
				tabData.accept(SyndredModBlocks.SOUL_MOSS_BLOCK.get().asItem());
				tabData.accept(SyndredModBlocks.SOUL_SHRUB.get().asItem());
				tabData.accept(SyndredModItems.SOUL_SHRUB_SEED.get());
				tabData.accept(SyndredModBlocks.CHARGER_PLANT.get().asItem());
				tabData.accept(SyndredModBlocks.SOUL_MOSS_CARPET.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SyndredModItems.SOULSTEEL_SWORD.get());
			tabData.accept(SyndredModItems.HORN_LANCE.get());
			tabData.accept(SyndredModItems.LEATHER_SOULSTEEL_HELMET.get());
			tabData.accept(SyndredModItems.LEATHER_SOULSTEEL_CHESTPLATE.get());
			tabData.accept(SyndredModItems.LEATHER_SOULSTEEL_LEGGINGS.get());
			tabData.accept(SyndredModItems.LEATHER_SOULSTEEL_BOOTS.get());
			tabData.accept(SyndredModItems.MIDNIGHT_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(SyndredModItems.SOULSTEEL_PICKAXE.get());
			tabData.accept(SyndredModItems.SOULSTEEL_AXE.get());
			tabData.accept(SyndredModItems.SOULSTEEL_HOE.get());
			tabData.accept(SyndredModItems.MIDNIGHT_PICKAXE.get());
			tabData.accept(SyndredModItems.MIDNIGHT_HOE.get());
			tabData.accept(SyndredModItems.MIDNIGHT_SHOVEL.get());
			tabData.accept(SyndredModItems.MIDNIGHT_AXE.get());
			tabData.accept(SyndredModItems.SOULSTEEL_SHOVEL.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(SyndredModBlocks.DRY_STONE.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE.get().asItem());
			tabData.accept(SyndredModBlocks.SOULSHIRE_LOG.get().asItem());
			tabData.accept(SyndredModBlocks.SOULSHIRE_LEAVES.get().asItem());
			tabData.accept(SyndredModBlocks.SOULSHIRE_SAPLING.get().asItem());
			tabData.accept(SyndredModBlocks.SOULSHIRE_WOOD.get().asItem());
			tabData.accept(SyndredModBlocks.STRIPPED_SOULSHIRE_LOG.get().asItem());
			tabData.accept(SyndredModBlocks.STRIPPED_SOULSHIRE_WOOD.get().asItem());
			tabData.accept(SyndredModBlocks.SCARLET_BLOSSOM.get().asItem());
			tabData.accept(SyndredModBlocks.SOUL_MOSS_BLOCK.get().asItem());
			tabData.accept(SyndredModBlocks.SOUL_SHRUB.get().asItem());
			tabData.accept(SyndredModBlocks.CHARGER_PLANT.get().asItem());
			tabData.accept(SyndredModBlocks.SOUL_MOSS_CARPET.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(SyndredModItems.CHARGER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(SyndredModItems.SOUL_SHIRE_FRUIT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SyndredModBlocks.DRY_STONEBRICKS.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_BRICKS.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_POLISHED.get().asItem());
			tabData.accept(SyndredModBlocks.DRY_STONE_POLISHED.get().asItem());
			tabData.accept(SyndredModBlocks.SMALL_DRY_STONEBRICKS.get().asItem());
			tabData.accept(SyndredModBlocks.LARGE_DRY_STONEBRICKS.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_CHISELED.get().asItem());
			tabData.accept(SyndredModBlocks.DRY_STONE_STAIRS.get().asItem());
			tabData.accept(SyndredModBlocks.DRY_STONE_WALL.get().asItem());
			tabData.accept(SyndredModBlocks.DRY_STONE_SLAB.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_STAIRS.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_SLABS.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_WALL.get().asItem());
			tabData.accept(SyndredModBlocks.DRY_STONEBRICKS_STAIRS.get().asItem());
			tabData.accept(SyndredModBlocks.DRY_STONEBRICKS_SLABS.get().asItem());
			tabData.accept(SyndredModBlocks.DRY_STONEBRICKS_WALL.get().asItem());
			tabData.accept(SyndredModBlocks.DRY_STONE_POLISHED_STAIRS.get().asItem());
			tabData.accept(SyndredModBlocks.DRY_STONE_POLISHED_SLAB.get().asItem());
			tabData.accept(SyndredModBlocks.DRY_STONE_POLISHEDWALL.get().asItem());
			tabData.accept(SyndredModBlocks.SMALL_DRY_STONEBRICK_STAIRS.get().asItem());
			tabData.accept(SyndredModBlocks.SMALL_DRY_STONEBRICK_SLAB.get().asItem());
			tabData.accept(SyndredModBlocks.SMALL_DRY_STONEBRICK_WALL.get().asItem());
			tabData.accept(SyndredModBlocks.LARGE_DRY_STONEBRICK_STAIRS.get().asItem());
			tabData.accept(SyndredModBlocks.LARGE_DRY_STONEBRICK_SLAB.get().asItem());
			tabData.accept(SyndredModBlocks.LARGE_DRY_STONEBRICK_WALL.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_BRICK_STAIRS.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_BRICK_SLAB.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_BRICKWALL.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_POLISHED_STAIRS.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_POLISHED_WALL.get().asItem());
			tabData.accept(SyndredModBlocks.HARSH_STONE_POLISHED_SLAB.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SyndredModItems.MIDNIGHT_INGOT.get());
			tabData.accept(SyndredModItems.SOUL_SHRUB_SEED.get());
		}
	}
}