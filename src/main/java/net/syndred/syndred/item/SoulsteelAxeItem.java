package net.syndred.syndred.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SoulsteelAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2200, 10f, 0, 18, TagKey.create(Registries.ITEM, ResourceLocation.parse("syndred:soulsteel_axe_repair_items")));

	public SoulsteelAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 9f, -3f, properties);
	}
}