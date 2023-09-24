package me.restonic4.tortillas.sound;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import me.restonic4.tortillas.Tortillas;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;


public class SoundRegister {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Tortillas.MOD_ID, Registries.SOUND_EVENT);

    public static final RegistrySupplier<SoundEvent> FRYING_PAN = registerSoundEvent("pan_hit");

    static RegistrySupplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(Tortillas.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void Register() {
        SOUND_EVENTS.register();
    }
}
