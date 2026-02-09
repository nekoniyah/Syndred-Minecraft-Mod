package net.syndred.syndred.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class SoulsteelPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 2200, 10f, 0, 18, TagKey.create(Registries.ITEM, ResourceLocation.parse("syndred:soulsteel_pickaxe_repair_items")));

	public SoulsteelPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 1f, -2.8f));
	}
}