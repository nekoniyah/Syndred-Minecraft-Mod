/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.syndred.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.syndred.SyndredMod;

public class SyndredModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SyndredMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SYNDRED_TAB = REGISTRY.register("syndred_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.syndred.syndred_tab")).icon(() -> new ItemStack(SyndredModBlocks.ANIMA_CONFLUX.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SyndredModBlocks.DEEPSLATE_SOULSTEEL_ORE.get().asItem());
				tabData.accept(SyndredModItems.RAW_SOULSTEEL.get());
				tabData.accept(SyndredModBlocks.ANIMA_CONFLUX.get().asItem());
				tabData.accept(SyndredModBlocks.SOULSTEEL_ORE.get().asItem());
				tabData.accept(SyndredModBlocks.DEEPSLATE_SPHALERITE_ORE.get().asItem());
				tabData.accept(SyndredModBlocks.SPHALERITE_ORE.get().asItem());
				tabData.accept(SyndredModItems.RAW_SPHALERITE.get());
			}).build());
}