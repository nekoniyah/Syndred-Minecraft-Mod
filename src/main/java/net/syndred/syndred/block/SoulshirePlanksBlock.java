package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SoulshirePlanksBlock extends Block {
	public SoulshirePlanksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(2f, 3f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}