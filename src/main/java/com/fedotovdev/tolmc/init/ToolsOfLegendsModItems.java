
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.fedotovdev.tolmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import com.fedotovdev.tolmc.item.SwordOfLegendsItem;
import com.fedotovdev.tolmc.item.ShovelOfLegendsItem;
import com.fedotovdev.tolmc.item.PickaxeOfLegendsItem;
import com.fedotovdev.tolmc.item.MultitoolItem;
import com.fedotovdev.tolmc.ToolsOfLegendsMod;

public class ToolsOfLegendsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ToolsOfLegendsMod.MODID);
	public static final RegistryObject<Item> SWORD_OF_LEGENDS = REGISTRY.register("sword_of_legends", () -> new SwordOfLegendsItem());
	public static final RegistryObject<Item> PICKAXE_OF_LEGENDS = REGISTRY.register("pickaxe_of_legends", () -> new PickaxeOfLegendsItem());
	public static final RegistryObject<Item> SHOVEL_OF_LEGENDS = REGISTRY.register("shovel_of_legends", () -> new ShovelOfLegendsItem());
	public static final RegistryObject<Item> MULTITOOL = REGISTRY.register("multitool", () -> new MultitoolItem());
	// Start of user code block custom items
	// End of user code block custom items
}
