package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;

public class SoulshireFenceBlock extends FenceBlock {
	public SoulshireFenceBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.WOOD).strength(2f, 3f).forceSolidOn());
	}
}