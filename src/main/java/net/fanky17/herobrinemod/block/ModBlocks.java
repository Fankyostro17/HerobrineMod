package net.fanky17.herobrinemod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fanky17.herobrinemod.HerobrineMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    //public static final Block BLOCKNAME = registerBlock(name, new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.Amethyst_CLOCK));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HerobrineMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(HerobrineMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        HerobrineMod.LOGGER.info("Registering Mod Blocks for " + HerobrineMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

        });
    }


}
