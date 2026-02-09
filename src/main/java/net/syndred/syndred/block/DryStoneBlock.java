package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class DryStoneBlock extends Block {
	public DryStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.2f, 4f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}