package net.fanky17.herobrinemod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class SkyBottleItem extends Item {
    public SkyBottleItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.herobrinemod.sky_bottle.shift_down"));
        } else {
            tooltip.add(Text.translatable("tooltip.herobrinemod.sky_bottle"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
