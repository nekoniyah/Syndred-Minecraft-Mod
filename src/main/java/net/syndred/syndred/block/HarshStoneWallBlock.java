package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class HarshStoneWallBlock extends WallBlock {
	public HarshStoneWallBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(2.2f, 9f).requiresCorrectToolForDrops().forceSolidOn());
	}
}