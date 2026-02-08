/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.syndred.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.syndred.block.*;
import net.mcreator.syndred.SyndredMod;

import java.util.function.Function;

public class SyndredModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SyndredMod.MODID);
	public static final DeferredBlock<Block> ANIMA_CONFLUX;
	public static final DeferredBlock<Block> DEEPSLATE_SPHALERITE_ORE;
	public static final DeferredBlock<Block> SPHALERITE_ORE;
	public static final DeferredBlock<Block> RAW_SOULSTEEL_BLOCK;
	public static final DeferredBlock<Block> RAW_SPHALERITE_BLOCK;
	public static final DeferredBlock<Block> SOULSTEEL_ORE;
	public static final DeferredBlock<Block> DEEPSLATE_SOULSTEEL_ORE;
	public static final DeferredBlock<Block> DRY_STONE;
	public static final DeferredBlock<Block> HARSH_STONE;
	public static final DeferredBlock<Block> SOULSTEEL_BLOCK;
	public static final DeferredBlock<Block> SPHALERITE_BLOCK;
	public static final DeferredBlock<Block> EGG_INCUBATOR;
	public static final DeferredBlock<Block> SOULSHIRE_LOG;
	public static final DeferredBlock<Block> SOULSHIRE_LEAVES;
	public static final DeferredBlock<Block> SOULSHIRE_SAPLING;
	public static final DeferredBlock<Block> SOULSHIRE_VINES;
	public static final DeferredBlock<Block> SOULSHIRE_VINES_END;
	public static final DeferredBlock<Block> SOULSHIRE_VINES_FRUITING;
	public static final DeferredBlock<Block> SOULSHIRE_VINES_END_FRUITING;
	public static final DeferredBlock<Block> SOULSHIRE_WOOD;
	public static final DeferredBlock<Block> STRIPPED_SOULSHIRE_LOG;
	public static final DeferredBlock<Block> STRIPPED_SOULSHIRE_WOOD;
	public static final DeferredBlock<Block> DRY_STONEBRICKS;
	public static final DeferredBlock<Block> HARSH_STONE_BRICKS;
	public static final DeferredBlock<Block> HARSH_STONE_POLISHED;
	public static final DeferredBlock<Block> DRY_STONE_POLISHED;
	public static final DeferredBlock<Block> SMALL_DRY_STONEBRICKS;
	public static final DeferredBlock<Block> LARGE_DRY_STONEBRICKS;
	public static final DeferredBlock<Block> HARSH_STONE_CHISELED;
	public static final DeferredBlock<Block> DRY_STONE_STAIRS;
	public static final DeferredBlock<Block> DRY_STONE_WALL;
	public static final DeferredBlock<Block> DRY_STONE_SLAB;
	public static final DeferredBlock<Block> HARSH_STONE_STAIRS;
	public static final DeferredBlock<Block> HARSH_STONE_SLABS;
	public static final DeferredBlock<Block> HARSH_STONE_WALL;
	public static final DeferredBlock<Block> DRY_STONEBRICKS_STAIRS;
	public static final DeferredBlock<Block> DRY_STONEBRICKS_SLABS;
	public static final DeferredBlock<Block> DRY_STONEBRICKS_WALL;
	public static final DeferredBlock<Block> DRY_STONE_POLISHED_STAIRS;
	public static final DeferredBlock<Block> DRY_STONE_POLISHED_SLAB;
	public static final DeferredBlock<Block> DRY_STONE_POLISHEDWALL;
	public static final DeferredBlock<Block> SMALL_DRY_STONEBRICK_STAIRS;
	public static final DeferredBlock<Block> SMALL_DRY_STONEBRICK_SLAB;
	public static final DeferredBlock<Block> SMALL_DRY_STONEBRICK_WALL;
	public static final DeferredBlock<Block> LARGE_DRY_STONEBRICK_STAIRS;
	public static final DeferredBlock<Block> LARGE_DRY_STONEBRICK_SLAB;
	public static final DeferredBlock<Block> LARGE_DRY_STONEBRICK_WALL;
	public static final DeferredBlock<Block> HARSH_STONE_BRICK_STAIRS;
	public static final DeferredBlock<Block> HARSH_STONE_BRICK_SLAB;
	public static final DeferredBlock<Block> HARSH_STONE_BRICKWALL;
	public static final DeferredBlock<Block> HARSH_STONE_POLISHED_STAIRS;
	public static final DeferredBlock<Block> HARSH_STONE_POLISHED_WALL;
	public static final DeferredBlock<Block> HARSH_STONE_POLISHED_SLAB;
	static {
		ANIMA_CONFLUX = register("anima_conflux", AnimaConfluxBlock::new);
		DEEPSLATE_SPHALERITE_ORE = register("deepslate_sphalerite_ore", DeepslateSphaleriteOreBlock::new);
		SPHALERITE_ORE = register("sphalerite_ore", SphaleriteOreBlock::new);
		RAW_SOULSTEEL_BLOCK = register("raw_soulsteel_block", RawSoulsteelBlockBlock::new);
		RAW_SPHALERITE_BLOCK = register("raw_sphalerite_block", RawSphaleriteBlockBlock::new);
		SOULSTEEL_ORE = register("soulsteel_ore", SoulsteelOreBlock::new);
		DEEPSLATE_SOULSTEEL_ORE = register("deepslate_soulsteel_ore", DeepslateSoulsteelOreBlock::new);
		DRY_STONE = register("dry_stone", DryStoneBlock::new);
		HARSH_STONE = register("harsh_stone", HarshStoneBlock::new);
		SOULSTEEL_BLOCK = register("soulsteel_block", SoulsteelBlockBlock::new);
		SPHALERITE_BLOCK = register("sphalerite_block", SphaleriteBlockBlock::new);
		EGG_INCUBATOR = register("egg_incubator", EggIncubatorBlock::new);
		SOULSHIRE_LOG = register("soulshire_log", SoulshireLogBlock::new);
		SOULSHIRE_LEAVES = register("soulshire_leaves", SoulshireLeavesBlock::new);
		SOULSHIRE_SAPLING = register("soulshire_sapling", SoulshireSaplingBlock::new);
		SOULSHIRE_VINES = register("soulshire_vines", SoulshireVinesBlock::new);
		SOULSHIRE_VINES_END = register("soulshire_vines_end", SoulshireVinesEndBlock::new);
		SOULSHIRE_VINES_FRUITING = register("soulshire_vines_fruiting", SoulshireVinesFruitingBlock::new);
		SOULSHIRE_VINES_END_FRUITING = register("soulshire_vines_end_fruiting", SoulshireVinesEndFruitingBlock::new);
		SOULSHIRE_WOOD = register("soulshire_wood", SoulshireWoodBlock::new);
		STRIPPED_SOULSHIRE_LOG = register("stripped_soulshire_log", StrippedSoulshireLogBlock::new);
		STRIPPED_SOULSHIRE_WOOD = register("stripped_soulshire_wood", StrippedSoulshireWoodBlock::new);
		DRY_STONEBRICKS = register("dry_stonebricks", DryStonebricksBlock::new);
		HARSH_STONE_BRICKS = register("harsh_stone_bricks", HarshStoneBricksBlock::new);
		HARSH_STONE_POLISHED = register("harsh_stone_polished", HarshStonePolishedBlock::new);
		DRY_STONE_POLISHED = register("dry_stone_polished", DryStonePolishedBlock::new);
		SMALL_DRY_STONEBRICKS = register("small_dry_stonebricks", SmallDryStonebricksBlock::new);
		LARGE_DRY_STONEBRICKS = register("large_dry_stonebricks", LargeDryStonebricksBlock::new);
		HARSH_STONE_CHISELED = register("harsh_stone_chiseled", HarshStoneChiseledBlock::new);
		DRY_STONE_STAIRS = register("dry_stone_stairs", DryStoneStairsBlock::new);
		DRY_STONE_WALL = register("dry_stone_wall", DryStoneWallBlock::new);
		DRY_STONE_SLAB = register("dry_stone_slab", DryStoneSlabBlock::new);
		HARSH_STONE_STAIRS = register("harsh_stone_stairs", HarshStoneStairsBlock::new);
		HARSH_STONE_SLABS = register("harsh_stone_slabs", HarshStoneSlabsBlock::new);
		HARSH_STONE_WALL = register("harsh_stone_wall", HarshStoneWallBlock::new);
		DRY_STONEBRICKS_STAIRS = register("dry_stonebricks_stairs", DryStonebricksStairsBlock::new);
		DRY_STONEBRICKS_SLABS = register("dry_stonebricks_slabs", DryStonebricksSlabsBlock::new);
		DRY_STONEBRICKS_WALL = register("dry_stonebricks_wall", DryStonebricksWallBlock::new);
		DRY_STONE_POLISHED_STAIRS = register("dry_stone_polished_stairs", DryStonePolishedStairsBlock::new);
		DRY_STONE_POLISHED_SLAB = register("dry_stone_polished_slab", DryStonePolishedSlabBlock::new);
		DRY_STONE_POLISHEDWALL = register("dry_stone_polishedwall", DryStonePolishedwallBlock::new);
		SMALL_DRY_STONEBRICK_STAIRS = register("small_dry_stonebrick_stairs", SmallDryStonebrickStairsBlock::new);
		SMALL_DRY_STONEBRICK_SLAB = register("small_dry_stonebrick_slab", SmallDryStonebrickSlabBlock::new);
		SMALL_DRY_STONEBRICK_WALL = register("small_dry_stonebrick_wall", SmallDryStonebrickWallBlock::new);
		LARGE_DRY_STONEBRICK_STAIRS = register("large_dry_stonebrick_stairs", LargeDryStonebrickStairsBlock::new);
		LARGE_DRY_STONEBRICK_SLAB = register("large_dry_stonebrick_slab", LargeDryStonebrickSlabBlock::new);
		LARGE_DRY_STONEBRICK_WALL = register("large_dry_stonebrick_wall", LargeDryStonebrickWallBlock::new);
		HARSH_STONE_BRICK_STAIRS = register("harsh_stone_brick_stairs", HarshStoneBrickStairsBlock::new);
		HARSH_STONE_BRICK_SLAB = register("harsh_stone_brick_slab", HarshStoneBrickSlabBlock::new);
		HARSH_STONE_BRICKWALL = register("harsh_stone_brickwall", HarshStoneBrickwallBlock::new);
		HARSH_STONE_POLISHED_STAIRS = register("harsh_stone_polished_stairs", HarshStonePolishedStairsBlock::new);
		HARSH_STONE_POLISHED_WALL = register("harsh_stone_polished_wall", HarshStonePolishedWallBlock::new);
		HARSH_STONE_POLISHED_SLAB = register("harsh_stone_polished_slab", HarshStonePolishedSlabBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}