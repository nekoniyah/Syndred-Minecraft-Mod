package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class DryStonebricksBlock extends Block {
	public DryStonebricksBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.3f, 8f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}