package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class HarshStonePolishedStairsBlock extends StairBlock {
	public HarshStonePolishedStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.BASALT).strength(2.4f, 15f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 15f;
	}
}