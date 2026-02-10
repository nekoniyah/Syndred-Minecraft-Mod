package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class SoulshireSlabBlock extends SlabBlock {
	public SoulshireSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(2f, 3f));
	}
}