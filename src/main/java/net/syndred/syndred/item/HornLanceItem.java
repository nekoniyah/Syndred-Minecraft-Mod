package net.syndred.syndred.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class HornLanceItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_WOODEN_TOOL, 1000, 4f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("syndred:horn_lance_repair_items")));

	public HornLanceItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 5f, -1.7f));
	}
}