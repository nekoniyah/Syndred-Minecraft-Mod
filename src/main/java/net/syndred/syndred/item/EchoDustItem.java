package net.syndred.syndred.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class EchoDustItem extends Item {
	public EchoDustItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}