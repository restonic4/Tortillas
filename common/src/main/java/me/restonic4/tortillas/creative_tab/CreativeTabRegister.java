package me.restonic4.tortillas.creative_tab;

import me.restonic4.restapi.RestApi;
import me.restonic4.restapi.creative_tab.CreativeTabRegistry;
import me.restonic4.restapi.holder.RestCreativeTab;

import static me.restonic4.tortillas.Tortillas.LOGGER;
import static me.restonic4.tortillas.Tortillas.MOD_ID;

public class CreativeTabRegister {
    public static RestCreativeTab TORTILLAS_TAB = CreativeTabRegistry.CreateCreativeTab(MOD_ID, "tortillas_tab", "tortilla");

    public static void register() {
        CreativeTabRegistry.Register(MOD_ID);
        LOGGER.log("Creative tabs registered");
    }
}
