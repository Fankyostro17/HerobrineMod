package net.fanky17.herobrinemod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.fabricmc.fabric.api.event.client.player.ClientPickBlockApplyCallback;
import net.fabricmc.fabric.api.event.client.player.ClientPickBlockGatherCallback;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.networking.v1.EntityTrackingEvents;
import net.fanky17.herobrinemod.block.ModBlocks;
import net.fanky17.herobrinemod.component.ModDataComponentTypes;
import net.fanky17.herobrinemod.item.ModItemGroups;
import net.fanky17.herobrinemod.item.ModItems;
import net.fanky17.herobrinemod.sound.ModSounds;
import net.fanky17.herobrinemod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HerobrineMod implements ModInitializer {

	public static final String MOD_ID = "herobrinemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGropus();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        ModDataComponentTypes.registerDataComponentTypes();
        ModSounds.registerSounds();

        ModWorldGeneration.generateModWorldGen();
	}

    //Se voglio vedere come fare le altre ricette devo andare su External Libraries/Gradle: net.minecraft:minecraft-merged-'codice diverso ogni volta':1.12.1-net.fabric.yarn.1_21_1.1.21.1+build.3-v2/data/minecraft/recipe/
    //per vedere eventi e per herobrine vederte Gradle: remapped.net.fabricmc.fabric-api:fabriv-events-interaction-{codice}
}