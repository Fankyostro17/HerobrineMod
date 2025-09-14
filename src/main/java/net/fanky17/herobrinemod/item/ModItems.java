package net.fanky17.herobrinemod.item;

import net.fanky17.herobrinemod.HerobrineMod;
import net.fanky17.herobrinemod.item.custom.RitualWandItem;
import net.minecraft.item.*;
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

    public static final Item GALAXY_CORE = registerItem("galaxy_core", new Item(new Item.Settings()));

    public static final Item OBSCURED_GEM = registerItem("obscured_gem", new Item(new Item.Settings()));

    public static final Item RITUAL_WAND = registerItem("ritual_wand", new RitualWandItem(new Item.Settings().maxDamage(128)));

    public static final Item OBSCURED_GEM_SWORD = registerItem("obscured_gem_sword", new SwordItem(ModToolMaterials.OBSCURED_GEM,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OBSCURED_GEM, 6, -2f))));

    public static final Item OBSCURED_GEM_PICKAXE = registerItem("obscured_gem_pickaxe", new PickaxeItem(ModToolMaterials.OBSCURED_GEM,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OBSCURED_GEM, 2, -2.4f))));

    public static final Item OBSCURED_GEM_SHOVEL = registerItem("obscured_gem_shovel", new ShovelItem(ModToolMaterials.OBSCURED_GEM,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OBSCURED_GEM, 3, -2.6f))));

    public static final Item OBSCURED_GEM_AXE = registerItem("obscured_gem_axe", new AxeItem(ModToolMaterials.OBSCURED_GEM,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.OBSCURED_GEM, 12, -2.8f))));

    public static final Item OBSCURED_GEM_HOE = registerItem("obscured_gem_hoe", new HoeItem(ModToolMaterials.OBSCURED_GEM,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.OBSCURED_GEM, 0, -2.6f))));

    public static final Item GALAXY_SWORD = registerItem("galaxy_sword", new SwordItem(ModToolMaterials.GALAXY_CORE,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GALAXY_CORE, 10, -1f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HerobrineMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        HerobrineMod.LOGGER.info("Registering Mod Items for " + HerobrineMod.MOD_ID);
    }
}
