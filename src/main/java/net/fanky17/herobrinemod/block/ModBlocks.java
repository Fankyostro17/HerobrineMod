package net.fanky17.herobrinemod.block;

import net.fanky17.herobrinemod.HerobrineMod;
import net.fanky17.herobrinemod.sound.ModSounds;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block RITUAL_BLOCK = registerBlock("ritual_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block OBSCURED_GEM_BLOCK = registerBlock("obscured_gem_block",
            new Block(AbstractBlock.Settings.create().strength(20f).requiresTool().sounds(ModSounds.OBSCURED_GEM_BLOCK_SOUNDS)));
    public static final Block OBSCURED_GEM_ORE = registerBlock("obscured_gem_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 3),
            AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));
    public static final Block OBSCURED_GEM_DEEPSLATE_ORE = registerBlock("obscured_gem_deepslate_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 4),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(HerobrineMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(HerobrineMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        HerobrineMod.LOGGER.info("Registering Mod Blocks for " + HerobrineMod.MOD_ID);
    }


}
