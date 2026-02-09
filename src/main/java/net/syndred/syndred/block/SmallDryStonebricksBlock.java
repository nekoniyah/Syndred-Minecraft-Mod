package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SmallDryStonebricksBlock extends Block {
	public SmallDryStonebricksBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.3f, 8f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}