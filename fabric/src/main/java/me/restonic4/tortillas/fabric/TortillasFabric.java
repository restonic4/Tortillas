package me.restonic4.tortillas.fabric;

import me.restonic4.tortillas.Tortillas;
import net.fabricmc.api.ModInitializer;

public class TortillasFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Tortillas.init();
    }
}