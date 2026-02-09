package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class DryStonebricksSlabsBlock extends SlabBlock {
	public DryStonebricksSlabsBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.3f, 8f));
	}
}