package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SphaleriteOreBlock extends Block {
	public SphaleriteOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(2.5f, 3f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}