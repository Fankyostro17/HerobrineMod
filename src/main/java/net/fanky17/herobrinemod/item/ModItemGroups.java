package net.fanky17.herobrinemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fanky17.herobrinemod.HerobrineMod;
import net.fanky17.herobrinemod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup HEROBRINE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(HerobrineMod.MOD_ID, "herobrine_items"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.BEDROCK_SWORD))
            .displayName(Text.translatable("itemgroup.herobrinemod.herobrine_items"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.IRON_HEROBRINE_SWORD);
                entries.add(ModItems.DIAMOND_HEROBRINE_SWORD_LV1);
                entries.add(ModItems.DIAMOND_HEROBRINE_SWORD_LV2);
                entries.add(ModItems.DIAMOND_HEROBRINE_SWORD_LV3);
                entries.add(ModItems.BEDROCK_SWORD);
                entries.add(ModItems.RITUAL_CORE);
                entries.add(ModItems.OBSCURED_GEM);
                entries.add(ModItems.RITUAL_WAND);
                entries.add(ModItems.OBSCURED_GEM_SWORD);
                entries.add(ModItems.OBSCURED_GEM_PICKAXE);
                entries.add(ModItems.OBSCURED_GEM_AXE);
                entries.add(ModItems.OBSCURED_GEM_HOE);
                entries.add(ModItems.OBSCURED_GEM_SHOVEL);
                entries.add(ModItems.GALAXY_SWORD);
                entries.add(ModItems.GALAXY_CORE);
                entries.add(ModItems.SKY_BOTTLE);

                entries.add(ModBlocks.RITUAL_BLOCK);
                entries.add(ModBlocks.RITUAL_PEDESTAL);
                entries.add(ModBlocks.OBSCURED_GEM_BLOCK);
                entries.add(ModBlocks.OBSCURED_GEM_ORE);
                entries.add(ModBlocks.OBSCURED_GEM_DEEPSLATE_ORE);
            }).build());

    //se voglio aggiungere un altro basta copiare quello di prima e cambiare i nomi e cambiare il contenuto in entries

    public static void registerItemGropus() {
        HerobrineMod.LOGGER.info("Registering Item Groups for " + HerobrineMod.MOD_ID);
    }
}
