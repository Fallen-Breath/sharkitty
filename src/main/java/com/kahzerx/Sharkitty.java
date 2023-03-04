package com.kahzerx;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class Sharkitty implements ModInitializer {
	public static final SharkittyItem SHARKITTY_ITEM = new SharkittyItem(
			new Item.Settings().rarity(Rarity.EPIC).maxCount(1).
			food(new FoodComponent.Builder().hunger(6).saturationModifier(0.8F).build())  // net.minecraft.item.FoodComponents#COOKED_SALMON
	);

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM, new Identifier("sharkitty", "sharkitty"), SHARKITTY_ITEM);
	}
}