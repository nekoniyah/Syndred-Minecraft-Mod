package net.mcreator.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;

public class DryStonebricksWallBlock extends WallBlock {
	public DryStonebricksWallBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.3f, 8f).forceSolidOn());
	}
}