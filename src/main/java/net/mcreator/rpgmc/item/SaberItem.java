
package net.mcreator.rpgmc.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rpgmc.RpgmcModElements;

@RpgmcModElements.ModElement.Tag
public class SaberItem extends RpgmcModElements.ModElement {
	@ObjectHolder("rpgmc:saber")
	public static final Item block = null;
	public SaberItem(RpgmcModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 150;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("saber"));
	}
}
