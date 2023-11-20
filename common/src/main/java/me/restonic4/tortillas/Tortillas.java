package me.restonic4.tortillas;

import me.restonic4.restapi.creative_tab.CreativeTabRegistry;
import me.restonic4.restapi.item.ItemRegistry;
import me.restonic4.restapi.sound.SoundRegistry;
import me.restonic4.tortillas.creative_tab.CreativeTabRegister;
import me.restonic4.tortillas.item.ItemRegister;
import me.restonic4.tortillas.sound.SoundRegister;

import java.util.Random;

public class Tortillas
{
	public static final String MOD_ID = "tortillas";

	public static void init() {
		ItemRegistry.CreateRegistry(MOD_ID);
		CreativeTabRegistry.CreateRegistry(MOD_ID);
		SoundRegistry.CreateRegistry(MOD_ID);

		ItemRegister.register();
		CreativeTabRegister.register();
		SoundRegister.register();
	}

	public static float getRandomFloat(float min, float max) {
		Random r = new Random();
		return r.nextFloat(max-min) + min;
	}
}
