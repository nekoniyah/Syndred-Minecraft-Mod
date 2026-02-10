package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;

public class SoulshireButtonBlock extends ButtonBlock {
	public SoulshireButtonBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, 30, properties.sound(SoundType.WOOD).strength(2f, 3f));
	}
}