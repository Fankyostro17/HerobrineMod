package net.fanky17.herobrinemod.item;

import com.google.common.base.Suppliers;
import net.fanky17.herobrinemod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    OBSCURED_GEM(ModTags.Blocks.INCORRECT_FOR_OBSCURED_GEM_TOOL , 4062, 12.0F, 8.0F, 30, () -> Ingredient.ofItems(ModItems.OBSCURED_GEM)),
    GALAXY_CORE(ModTags.Blocks.INCORRECT_FOR_GALAXY_TOOL, 10000, 30.0F, 30.0F, 100, () -> Ingredient.ofItems(ModItems.GALAXY_CORE)),
    HEROBRINE_IRON(ModTags.Blocks.INCORRECT_FOR_HEROBRINE_IRON_TOOL, -1, 10f, 15f, 50, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    HEROBRINE_DIAMOND(ModTags.Blocks.INCORRECT_FOR_HEROBRINE_DIAMOND_TOOL, -1, 20f, 49f, 100, () -> Ingredient.ofItems(Items.DIAMOND)),
    HEROBRINE_BEDROCK(ModTags.Blocks.INCORRECT_FOR_HEROBRINE_BEDROCK_TOOL, -1, 60f, 99f, 500, () -> Ingredient.ofItems(Items.BEDROCK));

    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
