package net.mcreator.syndred.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class TamajuiceItem extends Item {
	public TamajuiceItem(Item.Properties properties) {
		super(properties.stacksTo(16).food((new FoodProperties.Builder()).nutrition(8).saturationModifier(1.4f).alwaysEdible().build(), Consumables.DEFAULT_DRINK).usingConvertsTo(Items.GLASS_BOTTLE));
	}
}