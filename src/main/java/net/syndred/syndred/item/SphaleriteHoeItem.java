package net.syndred.syndred.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SphaleriteHoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 200, 5f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("syndred:sphalerite_hoe_repair_items")));

	public SphaleriteHoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, -1f, -2f, properties);
	}
}