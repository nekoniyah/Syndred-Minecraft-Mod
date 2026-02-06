/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.syndred.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.syndred.block.SphaleriteOreBlock;
import net.mcreator.syndred.block.SoulsteelOreBlock;
import net.mcreator.syndred.block.DeepslateSphaleriteOreBlock;
import net.mcreator.syndred.block.DeepslateSoulsteelOreBlock;
import net.mcreator.syndred.block.AnimaConfluxBlock;
import net.mcreator.syndred.SyndredMod;

import java.util.function.Function;

public class SyndredModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SyndredMod.MODID);
	public static final DeferredBlock<Block> DEEPSLATE_SOULSTEEL_ORE;
	public static final DeferredBlock<Block> ANIMA_CONFLUX;
	public static final DeferredBlock<Block> SOULSTEEL_ORE;
	public static final DeferredBlock<Block> DEEPSLATE_SPHALERITE_ORE;
	public static final DeferredBlock<Block> SPHALERITE_ORE;
	static {
		DEEPSLATE_SOULSTEEL_ORE = register("deepslate_soulsteel_ore", DeepslateSoulsteelOreBlock::new);
		ANIMA_CONFLUX = register("anima_conflux", AnimaConfluxBlock::new);
		SOULSTEEL_ORE = register("soulsteel_ore", SoulsteelOreBlock::new);
		DEEPSLATE_SPHALERITE_ORE = register("deepslate_sphalerite_ore", DeepslateSphaleriteOreBlock::new);
		SPHALERITE_ORE = register("sphalerite_ore", SphaleriteOreBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}