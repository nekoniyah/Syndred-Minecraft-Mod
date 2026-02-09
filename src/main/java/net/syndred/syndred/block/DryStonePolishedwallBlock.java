package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class DryStonePolishedwallBlock extends WallBlock {
	public DryStonePolishedwallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.3f, 8f).forceSolidOn());
	}
}