package me.officiallydragon.endified.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    ENDINIUM(5,3120,10.0f,7.0f,30, () -> Ingredient.ofItems(ModItems.ENDINIUM_SCRAP_4));

    private final int minigLevel;
    private final int ItemDurability;
    private final float minigSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int minigLevel, int itemDurability, float minigSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.minigLevel = minigLevel;
        ItemDurability = itemDurability;
        this.minigSpeed = minigSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.ItemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.minigSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.minigLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
