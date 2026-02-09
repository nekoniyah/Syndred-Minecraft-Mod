package net.syndred.syndred.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SphaleriteIngotItem extends Item {
	public SphaleriteIngotItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}