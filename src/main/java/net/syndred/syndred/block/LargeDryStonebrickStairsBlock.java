package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class LargeDryStonebrickStairsBlock extends StairBlock {
	public LargeDryStonebrickStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(1.3f, 8f));
	}

	@Override
	public float getExplosionResistance() {
		return 8f;
	}
}