package me.restonic4.tortillas.forge;

import dev.architectury.platform.forge.EventBuses;
import me.restonic4.tortillas.Tortillas;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Tortillas.MOD_ID)
public class TortillasForge {
    public TortillasForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Tortillas.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Tortillas.init();
    }
}