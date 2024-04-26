package me.officiallydragon.endified.sound;

import me.officiallydragon.endified.Endified;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent ORE_DETECTOR_FOUND_ORE = registerSoundEvent("ore_detector_found_ore");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Endified.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        Endified.LOGGER.info("Registering Sounds for " + Endified.MOD_ID);
    }
}
