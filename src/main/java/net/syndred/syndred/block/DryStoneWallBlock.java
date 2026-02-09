package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class DryStoneWallBlock extends WallBlock {
	public DryStoneWallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.2f, 4f).forceSolidOn());
	}
}