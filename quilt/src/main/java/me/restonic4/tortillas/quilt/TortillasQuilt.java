package me.restonic4.tortillas.quilt;

import me.restonic4.tortillas.Tortillas;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class TortillasQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        Tortillas.init();
    }
}