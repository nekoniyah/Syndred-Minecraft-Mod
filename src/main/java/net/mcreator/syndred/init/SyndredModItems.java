/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.syndred.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.syndred.item.*;
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
	public static final DeferredItem<Item> ECHO_DUST;
	public static final DeferredItem<Item> SOULSTEEL_SHARD;
	public static final DeferredItem<Item> SOULSTEEL_SWORD;
	public static final DeferredItem<Item> SOULSTEEL_PICKAXE;
	public static final DeferredItem<Item> SOULSTEEL_AXE;
	public static final DeferredItem<Item> SOULSTEEL_SPADE;
	public static final DeferredItem<Item> SOULSTEEL_HOE;
	public static final DeferredItem<Item> DRY_STONE;
	public static final DeferredItem<Item> HARSH_STONE;
	public static final DeferredItem<Item> SOULSTEEL_BLOCK;
	public static final DeferredItem<Item> SPHALERITE_BLOCK;
	public static final DeferredItem<Item> CHARGER_SPAWN_EGG;
	public static final DeferredItem<Item> HORN_LANCE;
	public static final DeferredItem<Item> EGG_INCUBATOR;
	public static final DeferredItem<Item> SOULSHIRE_LOG;
	public static final DeferredItem<Item> SOULSHIRE_LEAVES;
	public static final DeferredItem<Item> SOULSHIRE_SAPLING;
	public static final DeferredItem<Item> SOULSHIRE_VINES;
	public static final DeferredItem<Item> SOULSHIRE_VINES_END;
	public static final DeferredItem<Item> SOULSHIRE_VINES_FRUITING;
	public static final DeferredItem<Item> SOULSHIRE_VINES_END_FRUITING;
	public static final DeferredItem<Item> SOUL_SHIRE_FRUIT;
	public static final DeferredItem<Item> SOULSHIRE_WOOD;
	public static final DeferredItem<Item> STRIPPED_SOULSHIRE_LOG;
	public static final DeferredItem<Item> STRIPPED_SOULSHIRE_WOOD;
	public static final DeferredItem<Item> LEATHER_SOULSTEEL_HELMET;
	public static final DeferredItem<Item> LEATHER_SOULSTEEL_CHESTPLATE;
	public static final DeferredItem<Item> LEATHER_SOULSTEEL_LEGGINGS;
	public static final DeferredItem<Item> LEATHER_SOULSTEEL_BOOTS;
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
		ECHO_DUST = register("echo_dust", EchoDustItem::new);
		SOULSTEEL_SHARD = register("soulsteel_shard", SoulsteelShardItem::new);
		SOULSTEEL_SWORD = register("soulsteel_sword", SoulsteelSwordItem::new);
		SOULSTEEL_PICKAXE = register("soulsteel_pickaxe", SoulsteelPickaxeItem::new);
		SOULSTEEL_AXE = register("soulsteel_axe", SoulsteelAxeItem::new);
		SOULSTEEL_SPADE = register("soulsteel_spade", SoulsteelSpadeItem::new);
		SOULSTEEL_HOE = register("soulsteel_hoe", SoulsteelHoeItem::new);
		DRY_STONE = block(SyndredModBlocks.DRY_STONE);
		HARSH_STONE = block(SyndredModBlocks.HARSH_STONE);
		SOULSTEEL_BLOCK = block(SyndredModBlocks.SOULSTEEL_BLOCK);
		SPHALERITE_BLOCK = block(SyndredModBlocks.SPHALERITE_BLOCK);
		CHARGER_SPAWN_EGG = register("charger_spawn_egg", properties -> new SpawnEggItem(SyndredModEntities.CHARGER.get(), properties));
		HORN_LANCE = register("horn_lance", HornLanceItem::new);
		EGG_INCUBATOR = block(SyndredModBlocks.EGG_INCUBATOR);
		SOULSHIRE_LOG = block(SyndredModBlocks.SOULSHIRE_LOG);
		SOULSHIRE_LEAVES = block(SyndredModBlocks.SOULSHIRE_LEAVES);
		SOULSHIRE_SAPLING = block(SyndredModBlocks.SOULSHIRE_SAPLING);
		SOULSHIRE_VINES = block(SyndredModBlocks.SOULSHIRE_VINES);
		SOULSHIRE_VINES_END = block(SyndredModBlocks.SOULSHIRE_VINES_END);
		SOULSHIRE_VINES_FRUITING = block(SyndredModBlocks.SOULSHIRE_VINES_FRUITING);
		SOULSHIRE_VINES_END_FRUITING = block(SyndredModBlocks.SOULSHIRE_VINES_END_FRUITING);
		SOUL_SHIRE_FRUIT = register("soul_shire_fruit", SoulShireFruitItem::new);
		SOULSHIRE_WOOD = block(SyndredModBlocks.SOULSHIRE_WOOD);
		STRIPPED_SOULSHIRE_LOG = block(SyndredModBlocks.STRIPPED_SOULSHIRE_LOG);
		STRIPPED_SOULSHIRE_WOOD = block(SyndredModBlocks.STRIPPED_SOULSHIRE_WOOD);
		LEATHER_SOULSTEEL_HELMET = register("leather_soulsteel_helmet", LeatherSoulsteelItem.Helmet::new);
		LEATHER_SOULSTEEL_CHESTPLATE = register("leather_soulsteel_chestplate", LeatherSoulsteelItem.Chestplate::new);
		LEATHER_SOULSTEEL_LEGGINGS = register("leather_soulsteel_leggings", LeatherSoulsteelItem.Leggings::new);
		LEATHER_SOULSTEEL_BOOTS = register("leather_soulsteel_boots", LeatherSoulsteelItem.Boots::new);
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