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
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}