package net.fanky17.herobrinemod;

import net.fabricmc.api.ModInitializer;

import net.fanky17.herobrinemod.block.ModBlocks;
import net.fanky17.herobrinemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HerobrineMod implements ModInitializer {

	public static final String MOD_ID = "herobrinemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}