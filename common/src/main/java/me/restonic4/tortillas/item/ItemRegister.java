package me.restonic4.tortillas.item;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.restonic4.tortillas.Tortillas;
import me.restonic4.tortillas.creative_tab.CreativeTabRegister;
import me.restonic4.tortillas.item.custom.FryingPan;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

@SuppressWarnings("UnstableApiUsage")
public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Tortillas.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> TORTILLA = registerFood("tortilla", FoodRegister.TORTILLA);
    public static final RegistrySupplier<Item> TORTILLA_SLICE = registerFood("tortilla_slice", FoodRegister.TORTILLA_SLICE);
    public static final RegistrySupplier<Item> TORTILLA_WITH_BEETROOT = registerFood("tortilla_with_beetroot", FoodRegister.TORTILLA_WITH_BEETROOT);
    public static final RegistrySupplier<Item> TORTILLA_SANDWICH = registerFood("tortilla_sandwich", FoodRegister.TORTILLA_SANDWICH);

    public static final RegistrySupplier<Item> FRYING_PAN =
            ITEMS.register(
                    "frying_pan",
                    () -> new FryingPan(Tiers.IRON, 4, -2, new Item.Properties().arch$tab(CreativeTabRegister.TORTILLAS_TAB).durability(500))
            );

    static RegistrySupplier<Item> registerFood(String itemID, FoodProperties foodProperties) {
        return ITEMS.register(
                itemID,
                () -> new Item(new Item.Properties().arch$tab(CreativeTabRegister.TORTILLAS_TAB).food(foodProperties))
        );
    }

    public static void Register() {
        ITEMS.register();
        Tortillas.LOGGER.info("[" + Tortillas.MOD_ID + "] Items registered");
    }
}
