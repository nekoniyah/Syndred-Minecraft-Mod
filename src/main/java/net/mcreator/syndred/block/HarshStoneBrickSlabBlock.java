package net.mcreator.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class HarshStoneBrickSlabBlock extends SlabBlock {
	public HarshStoneBrickSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(2.4f, 15f).requiresCorrectToolForDrops());
	}
}