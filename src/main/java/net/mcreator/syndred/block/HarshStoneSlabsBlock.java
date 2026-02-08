package net.mcreator.syndred.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class HarshStoneSlabsBlock extends SlabBlock {
	public HarshStoneSlabsBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(2.2f, 9f).requiresCorrectToolForDrops());
	}
}