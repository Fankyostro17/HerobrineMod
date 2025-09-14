package net.fanky17.herobrinemod.item;

import net.fanky17.herobrinemod.HerobrineMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BEDROCK_SWORD = registerItem("bedrock_sword", new Item(new Item.Settings()));
    public static final Item IRON_HEROBRINE_SWORD = registerItem("iron_herobrine_sword", new Item(new Item.Settings()));
    public static final Item DIAMOND_HEROBRINE_SWORD_LV1 = registerItem("diamond_herobrine_sword_lv1", new Item(new Item.Settings()));
    public static final Item DIAMOND_HEROBRINE_SWORD_LV2 = registerItem("diamond_herobrine_sword_lv2", new Item(new Item.Settings()));
    public static final Item DIAMOND_HEROBRINE_SWORD_LV3 = registerItem("diamond_herobrine_sword_lv3", new Item(new Item.Settings()));
    public static final Item RITUAL_CORE = registerItem("ritual_core", new Item(new Item.Settings()));
    public static final Item OBSCURED_GEM = registerItem("obscured_gem", new Item(new Item.Settings()));
    //public static final Item RITUAL_CORE = registerItem("ritual_core", new RitualCoreItem(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HerobrineMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        HerobrineMod.LOGGER.info("Registering Mod Items for " + HerobrineMod.MOD_ID);
    }
}
