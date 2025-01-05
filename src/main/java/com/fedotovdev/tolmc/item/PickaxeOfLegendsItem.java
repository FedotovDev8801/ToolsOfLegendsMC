
package com.fedotovdev.tolmc.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PickaxeOfLegendsItem extends PickaxeItem {
	public PickaxeOfLegendsItem() {
		super(new Tier() {
			public int getUses() {
				return 1006;
			}

			public float getSpeed() {
				return 999f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 99;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.AMETHYST_BLOCK));
			}
		}, 1, 5f, new Item.Properties().fireResistant());
	}
}
