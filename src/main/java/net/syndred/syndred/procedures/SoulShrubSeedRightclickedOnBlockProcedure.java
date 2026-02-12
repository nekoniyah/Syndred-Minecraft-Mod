package net.syndred.syndred.procedures;

import net.syndred.syndred.init.SyndredModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class SoulShrubSeedRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((SyndredModBlocks.SOUL_MOSS_BLOCK.get() == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() || Blocks.MOSS_BLOCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				|| Blocks.MUD == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() || Blocks.MYCELIUM == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				|| Blocks.PALE_MOSS_BLOCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() || Blocks.GRASS_BLOCK == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()
				|| Blocks.PODZOL == (world.getBlockState(BlockPos.containing(x, y, z))).getBlock()) && Blocks.AIR == (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock()) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SOUL, x, y, z, 5, 2, 2, 2, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.COMPOSTER, x, y, z, 20, 1, 1, 1, 1);
			world.setBlock(BlockPos.containing(x, y + 1, z), SyndredModBlocks.SOUL_SHRUB.get().defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y, z), SyndredModBlocks.SOUL_MOSS_BLOCK.get().defaultBlockState(), 3);
		}
	}
}