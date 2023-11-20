package me.restonic4.tortillas;

import me.restonic4.tortillas.creative_tab.CreativeTabRegister;
import me.restonic4.tortillas.item.FoodRegister;
import me.restonic4.tortillas.item.ItemRegister;
import me.restonic4.tortillas.sound.SoundRegister;
import net.minecraft.network.protocol.status.ServerStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.util.VersionNumber;

import java.util.Random;

public class Tortillas
{
	public static final String MOD_ID = "tortillas";
	public static final Logger LOGGER = LogManager.getLogger("Tortillas");

	public static void init() {
		LOGGER.info("[" + MOD_ID + "] Starting mod");

		ItemRegister.Register();
		CreativeTabRegister.Register();
		FoodRegister.Register();
		SoundRegister.Register();

		LOGGER.info("[" + MOD_ID + "] All registered");


	}

	public static float getRandomFloat(float min, float max) {
		Random r = new Random();
		return r.nextFloat(max-min) + min;
	}
}
