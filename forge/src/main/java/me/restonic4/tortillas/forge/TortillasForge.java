package me.restonic4.tortillas.forge;

import dev.architectury.platform.forge.EventBuses;
import me.restonic4.tortillas.Tortillas;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static me.restonic4.tortillas.Tortillas.MOD_ID;

@Mod(MOD_ID)
public class TortillasForge {
    public TortillasForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EventBuses.registerModEventBus(MOD_ID, modEventBus);

        Tortillas.init();
    }
}