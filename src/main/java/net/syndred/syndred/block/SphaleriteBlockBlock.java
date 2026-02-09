package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SphaleriteBlockBlock extends Block {
	public SphaleriteBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(3.5f, 4f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}