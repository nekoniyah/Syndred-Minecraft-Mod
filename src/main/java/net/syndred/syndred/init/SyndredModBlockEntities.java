/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.syndred.syndred.init;

import net.syndred.syndred.block.entity.EggIncubatorBlockEntity;
import net.syndred.syndred.block.entity.AnimaConfluxBlockEntity;
import net.syndred.syndred.SyndredMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber
public class SyndredModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, SyndredMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<AnimaConfluxBlockEntity>> ANIMA_CONFLUX = register("anima_conflux", SyndredModBlocks.ANIMA_CONFLUX, AnimaConfluxBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<EggIncubatorBlockEntity>> EGG_INCUBATOR = register("egg_incubator", SyndredModBlocks.EGG_INCUBATOR, EggIncubatorBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, ANIMA_CONFLUX.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, EGG_INCUBATOR.get(), SidedInvWrapper::new);
	}
}