package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class DryStoneStairsBlock extends StairBlock {
	public DryStoneStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(1.2f, 4f));
	}

	@Override
	public float getExplosionResistance() {
		return 4f;
	}
}