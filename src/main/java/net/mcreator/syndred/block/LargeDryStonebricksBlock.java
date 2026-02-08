package net.mcreator.syndred.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class LargeDryStonebricksBlock extends Block {
	public LargeDryStonebricksBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.3f, 8f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}