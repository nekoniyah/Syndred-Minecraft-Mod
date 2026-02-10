package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceGateBlock;

public class SoulshireFenceGateBlock extends FenceGateBlock {
	public SoulshireFenceGateBlock(BlockBehaviour.Properties properties) {
		super(WoodType.OAK, properties.sound(SoundType.WOOD).strength(2f, 3f).forceSolidOn());
	}
}