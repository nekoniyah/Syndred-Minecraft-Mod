package net.syndred.syndred.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SoulsteelSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2200, 10f, 0, 18, TagKey.create(Registries.ITEM, ResourceLocation.parse("syndred:soulsteel_sword_repair_items")));

	public SoulsteelSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 7f, -2.4f));
	}
}