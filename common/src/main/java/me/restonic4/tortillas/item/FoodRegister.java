package me.restonic4.tortillas.item;

import me.restonic4.tortillas.Tortillas;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodRegister {
    static MobEffectInstance sandwichEffect = new MobEffectInstance(MobEffects.HEALTH_BOOST,(20*60*5),2);

    public static final FoodProperties TORTILLA = (new FoodProperties.Builder()).nutrition(8).saturationMod(1.7f).build();
    public static final FoodProperties TORTILLA_SLICE = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.29f).fast().build();
    public static final FoodProperties TORTILLA_WITH_BEETROOT = (new FoodProperties.Builder()).nutrition(10).saturationMod(2f).build();
    public static final FoodProperties TORTILLA_SANDWICH = (new FoodProperties.Builder()).nutrition(20).saturationMod(5f).effect(sandwichEffect, 1).build();

    public static void Register() {
        Tortillas.LOGGER.info("[" + Tortillas.MOD_ID + "] Food registered");
    }
}
