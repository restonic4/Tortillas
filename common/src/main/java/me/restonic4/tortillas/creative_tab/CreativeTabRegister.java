package me.restonic4.tortillas.creative_tab;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.restonic4.tortillas.Tortillas;
import me.restonic4.tortillas.item.ItemRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTabRegister {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Tortillas.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> TORTILLAS_TAB =
            TABS.register(
                    "tortillas_tab",
                    () -> CreativeTabRegistry.create(
                            Component.nullToEmpty("Tortillas"),
                            () -> new ItemStack(ItemRegister.TORTILLA.get())
                    )
            );

    public static void Register() {
        TABS.register();
        Tortillas.LOGGER.info("[" + Tortillas.MOD_ID + "] Creative tabs registered");
    }
}
