/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.syndred.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.syndred.item.SphaleriteIngotItem;
import net.mcreator.syndred.item.SoulsteelIngotItem;
import net.mcreator.syndred.item.RawSphaleriteItem;
import net.mcreator.syndred.item.RawSoulsteelItem;
import net.mcreator.syndred.SyndredMod;

import java.util.function.Function;

public class SyndredModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SyndredMod.MODID);
	public static final DeferredItem<Item> RAW_SOULSTEEL;
	public static final DeferredItem<Item> ANIMA_CONFLUX;
	public static final DeferredItem<Item> DEEPSLATE_SPHALERITE_ORE;
	public static final DeferredItem<Item> SPHALERITE_ORE;
	public static final DeferredItem<Item> RAW_SPHALERITE;
	public static final DeferredItem<Item> SOULSTEEL_INGOT;
	public static final DeferredItem<Item> SPHALERITE_INGOT;
	public static final DeferredItem<Item> RAW_SOULSTEEL_BLOCK;
	public static final DeferredItem<Item> RAW_SPHALERITE_BLOCK;
	public static final DeferredItem<Item> SOULSTEEL_ORE;
	public static final DeferredItem<Item> DEEPSLATE_SOULSTEEL_ORE;
	static {
		RAW_SOULSTEEL = register("raw_soulsteel", RawSoulsteelItem::new);
		ANIMA_CONFLUX = block(SyndredModBlocks.ANIMA_CONFLUX);
		DEEPSLATE_SPHALERITE_ORE = block(SyndredModBlocks.DEEPSLATE_SPHALERITE_ORE);
		SPHALERITE_ORE = block(SyndredModBlocks.SPHALERITE_ORE);
		RAW_SPHALERITE = register("raw_sphalerite", RawSphaleriteItem::new);
		SOULSTEEL_INGOT = register("soulsteel_ingot", SoulsteelIngotItem::new);
		SPHALERITE_INGOT = register("sphalerite_ingot", SphaleriteIngotItem::new);
		RAW_SOULSTEEL_BLOCK = block(SyndredModBlocks.RAW_SOULSTEEL_BLOCK);
		RAW_SPHALERITE_BLOCK = block(SyndredModBlocks.RAW_SPHALERITE_BLOCK);
		SOULSTEEL_ORE = block(SyndredModBlocks.SOULSTEEL_ORE);
		DEEPSLATE_SOULSTEEL_ORE = block(SyndredModBlocks.DEEPSLATE_SOULSTEEL_ORE);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}