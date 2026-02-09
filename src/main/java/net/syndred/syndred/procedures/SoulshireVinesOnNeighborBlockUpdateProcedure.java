package net.syndred.syndred.procedures;

import net.syndred.syndred.init.SyndredModBlocks;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SoulshireVinesOnNeighborBlockUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES_END.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES_FRUITING.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES_END_FRUITING.get())) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SyndredModBlocks.SOULSHIRE_VINES_END.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES_FRUITING.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SyndredModBlocks.SOULSHIRE_VINES_END_FRUITING.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES_END.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES_FRUITING.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES_END_FRUITING.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES_END.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SyndredModBlocks.SOULSHIRE_VINES.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SyndredModBlocks.SOULSHIRE_VINES_END_FRUITING.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SyndredModBlocks.SOULSHIRE_VINES_FRUITING.get().defaultBlockState();
					BlockState _bso = world.getBlockState(_bp);
					for (Property<?> _propertyOld : _bso.getProperties()) {
						Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
						if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
							try {
								_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
							} catch (Exception e) {
							}
					}
					world.setBlock(_bp, _bs, 3);
				}
			}
		}
	}
}