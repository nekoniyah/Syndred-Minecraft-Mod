package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class SoulshireStairsBlock extends StairBlock {
	public SoulshireStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.WOOD).strength(2f, 3f));
	}

	@Override
	public float getExplosionResistance() {
		return 3f;
	}
}