package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class HarshStoneStairsBlock extends StairBlock {
	public HarshStoneStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.BASALT).strength(2.2f, 9f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 9f;
	}
}