package net.syndred.syndred.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SphaleriteAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 200, 5f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("syndred:sphalerite_axe_repair_items")));

	public SphaleriteAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 7.5f, -3.1f, properties);
	}
}