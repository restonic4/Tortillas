package me.restonic4.tortillas.sound;

import me.restonic4.restapi.holder.RestSound;
import me.restonic4.restapi.sound.SoundRegistry;

import static me.restonic4.tortillas.Tortillas.MOD_ID;


public class SoundRegister {
    public static RestSound FRYING_PAN = SoundRegistry.RegisterSound(MOD_ID, "pan_hit");

    public static void register() {
        SoundRegistry.Register(MOD_ID);
    }
}
