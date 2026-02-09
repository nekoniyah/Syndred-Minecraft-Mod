package net.syndred.syndred.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class SoulshireLeavesBlock extends TintedParticleLeavesBlock {
	public SoulshireLeavesBlock(BlockBehaviour.Properties properties) {
		super(0f, properties.mapColor(MapColor.COLOR_RED).sound(SoundType.CHERRY_LEAVES).strength(0.2f).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava().isSuffocating((bs, br, bp) -> false)
				.isViewBlocking((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 1;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}
}