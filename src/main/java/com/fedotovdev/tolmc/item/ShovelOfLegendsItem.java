
package com.fedotovdev.tolmc.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;

public class ShovelOfLegendsItem extends ShovelItem {
	public ShovelOfLegendsItem() {
		super(new Tier() {
			public int getUses() {
				return 999;
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
				return Ingredient.of();
			}
		}, 1, 5f, new Item.Properties().fireResistant());
	}
}
