package net.fanky17.herobrinemod.item;

import net.fanky17.herobrinemod.HerobrineMod;
import net.fanky17.herobrinemod.item.custom.RitualWandItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item BEDROCK_SWORD = registerItem("bedrock_sword", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.herobrinemod.bedrock_sword.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item IRON_HEROBRINE_SWORD = registerItem("iron_herobrine_sword", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.herobrinemod.iron_herobrine_sword.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item DIAMOND_HEROBRINE_SWORD_LV1 = registerItem("diamond_herobrine_sword_lv1", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.herobrinemod.diamond_herobrine_sword_lv1.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item DIAMOND_HEROBRINE_SWORD_LV2 = registerItem("diamond_herobrine_sword_lv2", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.herobrinemod.diamond_herobrine_sword_lv2.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item DIAMOND_HEROBRINE_SWORD_LV3 = registerItem("diamond_herobrine_sword_lv3", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.herobrinemod.diamond_herobrine_sword_lv3.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item RITUAL_CORE = registerItem("ritual_core", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.herobrinemod.ritual_core.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item OBSCURED_GEM = registerItem("obscured_gem", new Item(new Item.Settings()){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.herobrinemod.obscured_gem.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item RITUAL_WAND = registerItem("ritual_wand", new RitualWandItem(new Item.Settings().maxDamage(128)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HerobrineMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        HerobrineMod.LOGGER.info("Registering Mod Items for " + HerobrineMod.MOD_ID);
    }
}
