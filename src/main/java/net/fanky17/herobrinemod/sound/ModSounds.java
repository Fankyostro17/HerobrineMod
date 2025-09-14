package net.fanky17.herobrinemod.sound;

import net.fanky17.herobrinemod.HerobrineMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent OBSCURED_GEM_BLOCK_BREAK = registerSoundEvent("obscured_gem_block_break");
    public static final SoundEvent OBSCURED_GEM_BLOCK_STEP = registerSoundEvent("obscured_gem_block_step");
    public static final SoundEvent OBSCURED_GEM_BLOCK_PLACE = registerSoundEvent("obscured_gem_block_place");
    public static final SoundEvent OBSCURED_GEM_BLOCK_HIT = registerSoundEvent("obscured_gem_block_hit");
    public static final SoundEvent OBSCURED_GEM_BLOCK_FALL = registerSoundEvent("obscured_gem_block_fall");

    public static final BlockSoundGroup OBSCURED_GEM_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f, OBSCURED_GEM_BLOCK_BREAK,
            OBSCURED_GEM_BLOCK_STEP, OBSCURED_GEM_BLOCK_PLACE,  OBSCURED_GEM_BLOCK_HIT, OBSCURED_GEM_BLOCK_FALL);

    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(HerobrineMod.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        HerobrineMod.LOGGER.info("Registering Mod Sounds for " + HerobrineMod.MOD_ID);
    }
}
