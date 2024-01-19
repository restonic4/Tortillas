package me.restonic4.tortillas.neoforge;

import me.restonic4.tortillas.Tortillas;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Tortillas.MOD_ID)
public class TortillasNeoForge {
	public TortillasNeoForge(IEventBus modEventBus) {
		Tortillas.init();
	}
}
