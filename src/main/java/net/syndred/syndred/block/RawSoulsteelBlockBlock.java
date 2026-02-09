package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class RawSoulsteelBlockBlock extends Block {
	public RawSoulsteelBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(4f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}