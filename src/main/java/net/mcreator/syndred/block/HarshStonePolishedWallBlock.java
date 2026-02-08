package net.mcreator.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.SoundType;

public class HarshStonePolishedWallBlock extends WallBlock {
	public HarshStonePolishedWallBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(2.4f, 15f).requiresCorrectToolForDrops().forceSolidOn());
	}
}