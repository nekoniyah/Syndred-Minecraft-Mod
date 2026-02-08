package net.mcreator.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class SmallDryStonebrickSlabBlock extends SlabBlock {
	public SmallDryStonebrickSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.3f, 8f));
	}
}