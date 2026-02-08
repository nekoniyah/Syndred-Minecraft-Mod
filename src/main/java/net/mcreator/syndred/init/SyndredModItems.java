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
	public static final DeferredItem<Item> DRY_STONEBRICKS;
	public static final DeferredItem<Item> HARSH_STONE_BRICKS;
	public static final DeferredItem<Item> HARSH_STONE_POLISHED;
	public static final DeferredItem<Item> DRY_STONE_POLISHED;
	public static final DeferredItem<Item> SMALL_DRY_STONEBRICKS;
	public static final DeferredItem<Item> LARGE_DRY_STONEBRICKS;
	public static final DeferredItem<Item> HARSH_STONE_CHISELED;
	public static final DeferredItem<Item> DRY_STONE_STAIRS;
	public static final DeferredItem<Item> DRY_STONE_WALL;
	public static final DeferredItem<Item> DRY_STONE_SLAB;
	public static final DeferredItem<Item> HARSH_STONE_STAIRS;
	public static final DeferredItem<Item> HARSH_STONE_SLABS;
	public static final DeferredItem<Item> HARSH_STONE_WALL;
	public static final DeferredItem<Item> DRY_STONEBRICKS_STAIRS;
	public static final DeferredItem<Item> DRY_STONEBRICKS_SLABS;
	public static final DeferredItem<Item> DRY_STONEBRICKS_WALL;
	public static final DeferredItem<Item> DRY_STONE_POLISHED_STAIRS;
	public static final DeferredItem<Item> DRY_STONE_POLISHED_SLAB;
	public static final DeferredItem<Item> DRY_STONE_POLISHEDWALL;
	public static final DeferredItem<Item> SMALL_DRY_STONEBRICK_STAIRS;
	public static final DeferredItem<Item> SMALL_DRY_STONEBRICK_SLAB;
	public static final DeferredItem<Item> SMALL_DRY_STONEBRICK_WALL;
	public static final DeferredItem<Item> LARGE_DRY_STONEBRICK_STAIRS;
	public static final DeferredItem<Item> LARGE_DRY_STONEBRICK_SLAB;
	public static final DeferredItem<Item> LARGE_DRY_STONEBRICK_WALL;
	public static final DeferredItem<Item> HARSH_STONE_BRICK_STAIRS;
	public static final DeferredItem<Item> HARSH_STONE_BRICK_SLAB;
	public static final DeferredItem<Item> HARSH_STONE_BRICKWALL;
	public static final DeferredItem<Item> HARSH_STONE_POLISHED_STAIRS;
	public static final DeferredItem<Item> HARSH_STONE_POLISHED_WALL;
	public static final DeferredItem<Item> HARSH_STONE_POLISHED_SLAB;
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
		DRY_STONEBRICKS = block(SyndredModBlocks.DRY_STONEBRICKS);
		HARSH_STONE_BRICKS = block(SyndredModBlocks.HARSH_STONE_BRICKS);
		HARSH_STONE_POLISHED = block(SyndredModBlocks.HARSH_STONE_POLISHED);
		DRY_STONE_POLISHED = block(SyndredModBlocks.DRY_STONE_POLISHED);
		SMALL_DRY_STONEBRICKS = block(SyndredModBlocks.SMALL_DRY_STONEBRICKS);
		LARGE_DRY_STONEBRICKS = block(SyndredModBlocks.LARGE_DRY_STONEBRICKS);
		HARSH_STONE_CHISELED = block(SyndredModBlocks.HARSH_STONE_CHISELED);
		DRY_STONE_STAIRS = block(SyndredModBlocks.DRY_STONE_STAIRS);
		DRY_STONE_WALL = block(SyndredModBlocks.DRY_STONE_WALL);
		DRY_STONE_SLAB = block(SyndredModBlocks.DRY_STONE_SLAB);
		HARSH_STONE_STAIRS = block(SyndredModBlocks.HARSH_STONE_STAIRS);
		HARSH_STONE_SLABS = block(SyndredModBlocks.HARSH_STONE_SLABS);
		HARSH_STONE_WALL = block(SyndredModBlocks.HARSH_STONE_WALL);
		DRY_STONEBRICKS_STAIRS = block(SyndredModBlocks.DRY_STONEBRICKS_STAIRS);
		DRY_STONEBRICKS_SLABS = block(SyndredModBlocks.DRY_STONEBRICKS_SLABS);
		DRY_STONEBRICKS_WALL = block(SyndredModBlocks.DRY_STONEBRICKS_WALL);
		DRY_STONE_POLISHED_STAIRS = block(SyndredModBlocks.DRY_STONE_POLISHED_STAIRS);
		DRY_STONE_POLISHED_SLAB = block(SyndredModBlocks.DRY_STONE_POLISHED_SLAB);
		DRY_STONE_POLISHEDWALL = block(SyndredModBlocks.DRY_STONE_POLISHEDWALL);
		SMALL_DRY_STONEBRICK_STAIRS = block(SyndredModBlocks.SMALL_DRY_STONEBRICK_STAIRS);
		SMALL_DRY_STONEBRICK_SLAB = block(SyndredModBlocks.SMALL_DRY_STONEBRICK_SLAB);
		SMALL_DRY_STONEBRICK_WALL = block(SyndredModBlocks.SMALL_DRY_STONEBRICK_WALL);
		LARGE_DRY_STONEBRICK_STAIRS = block(SyndredModBlocks.LARGE_DRY_STONEBRICK_STAIRS);
		LARGE_DRY_STONEBRICK_SLAB = block(SyndredModBlocks.LARGE_DRY_STONEBRICK_SLAB);
		LARGE_DRY_STONEBRICK_WALL = block(SyndredModBlocks.LARGE_DRY_STONEBRICK_WALL);
		HARSH_STONE_BRICK_STAIRS = block(SyndredModBlocks.HARSH_STONE_BRICK_STAIRS);
		HARSH_STONE_BRICK_SLAB = block(SyndredModBlocks.HARSH_STONE_BRICK_SLAB);
		HARSH_STONE_BRICKWALL = block(SyndredModBlocks.HARSH_STONE_BRICKWALL);
		HARSH_STONE_POLISHED_STAIRS = block(SyndredModBlocks.HARSH_STONE_POLISHED_STAIRS);
		HARSH_STONE_POLISHED_WALL = block(SyndredModBlocks.HARSH_STONE_POLISHED_WALL);
		HARSH_STONE_POLISHED_SLAB = block(SyndredModBlocks.HARSH_STONE_POLISHED_SLAB);
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