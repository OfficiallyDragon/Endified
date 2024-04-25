package me.officiallydragon.endified.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent END_BERRIES = new FoodComponent.Builder().hunger(5).saturationModifier(10)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 50), 100).build();
}
