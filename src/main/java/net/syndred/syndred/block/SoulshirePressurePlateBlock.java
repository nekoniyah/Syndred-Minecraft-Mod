package net.syndred.syndred.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class SoulshirePressurePlateBlock extends PressurePlateBlock {
	public SoulshirePressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.WOOD).strength(2f, 3f).forceSolidOn());
	}
}