package net.mcreator.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class DryStoneSlabBlock extends SlabBlock {
	public DryStoneSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.2f, 4f));
	}
}