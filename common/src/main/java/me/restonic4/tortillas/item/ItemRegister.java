package me.restonic4.tortillas.item;

import me.restonic4.restapi.RestApi;
import me.restonic4.restapi.holder.RestItem;
import me.restonic4.restapi.item.ItemRegistry;
import me.restonic4.restapi.util.CustomItemProperties;
import me.restonic4.tortillas.creative_tab.CreativeTabRegister;
import me.restonic4.tortillas.item.custom.FryingPan;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Tiers;

import static me.restonic4.tortillas.Tortillas.MOD_ID;

public class ItemRegister {
    public static MobEffectInstance TORTILLA_SANDWICH_EFFECT = ItemRegistry.CreateExistingEffect(MobEffects.HEALTH_BOOST, (20*60*5),2);

    public static RestItem TORTILLA = ItemRegistry.CreateFood(MOD_ID, "tortilla", CreativeTabRegister.TORTILLAS_TAB, 8, 1.7f);
    public static RestItem TORTILLA_SLICE = ItemRegistry.CreateFood(MOD_ID, "tortilla_slice", CreativeTabRegister.TORTILLAS_TAB, 1, 0.29f);
    public static RestItem TORTILLA_WITH_BEETROOT = ItemRegistry.CreateFood(MOD_ID, "tortilla_with_beetroot", CreativeTabRegister.TORTILLAS_TAB, 10, 2);
    public static RestItem TORTILLA_SANDWICH = ItemRegistry.CreateFoodWithEffect(MOD_ID, "tortilla_sandwich", CreativeTabRegister.TORTILLAS_TAB, 20, 5, TORTILLA_SANDWICH_EFFECT, 1);

    public static RestItem FRYING_PAN = ItemRegistry.CreateCustom(
            MOD_ID,
            "frying_pan",
            () -> new FryingPan(
                        Tiers.IRON,
                        4,
                        -2,
                        new CustomItemProperties().tab(CreativeTabRegister.TORTILLAS_TAB).durability(500).build()
                )
    );

    public static void register() {
        ItemRegistry.Register(MOD_ID);
        RestApi.Log("Items registered", MOD_ID);
    }
}
