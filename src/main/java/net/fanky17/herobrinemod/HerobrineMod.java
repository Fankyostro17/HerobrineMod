package net.fanky17.herobrinemod;

import net.fabricmc.api.ModInitializer;

import net.fanky17.herobrinemod.block.ModBlocks;
import net.fanky17.herobrinemod.item.ModItemGroups;
import net.fanky17.herobrinemod.item.ModItems;
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
	}

    //Se voglio vedere come fare le altre ricette devo andare su External Libraries/Gradle: net.minecraft:minecraft-merged-'codice diverso ogni volta':1.12.1-net.fabric.yarn.1_21_1.1.21.1+build.3-v2/data/minecraft/recipe/
}