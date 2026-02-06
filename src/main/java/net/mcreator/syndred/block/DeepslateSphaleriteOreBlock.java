package net.mcreator.syndred.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class DeepslateSphaleriteOreBlock extends Block {
	public DeepslateSphaleriteOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(2.5f, 3f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}