
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.fedotovdev.tolmc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.fedotovdev.tolmc.ToolsOfLegendsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ToolsOfLegendsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ToolsOfLegendsMod.MODID);
	public static final RegistryObject<CreativeModeTab> TOOLS_OF_LEGENDS = REGISTRY.register("tools_of_legends",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.tools_of_legends.tools_of_legends")).icon(() -> new ItemStack(Items.NETHER_STAR)).displayItems((parameters, tabData) -> {
				tabData.accept(ToolsOfLegendsModItems.SWORD_OF_LEGENDS.get());
				tabData.accept(ToolsOfLegendsModItems.PICKAXE_OF_LEGENDS.get());
				tabData.accept(ToolsOfLegendsModItems.SHOVEL_OF_LEGENDS.get());
				tabData.accept(ToolsOfLegendsModItems.MULTITOOL.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ToolsOfLegendsModItems.SWORD_OF_LEGENDS.get());
			tabData.accept(ToolsOfLegendsModItems.PICKAXE_OF_LEGENDS.get());
			tabData.accept(ToolsOfLegendsModItems.SHOVEL_OF_LEGENDS.get());
			tabData.accept(ToolsOfLegendsModItems.MULTITOOL.get());
		}
	}
}
