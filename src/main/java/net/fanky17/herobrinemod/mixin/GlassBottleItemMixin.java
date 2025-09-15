package net.fanky17.herobrinemod.mixin;

import net.fanky17.herobrinemod.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.GlassBottleItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GlassBottleItem.class)
public class GlassBottleItemMixin {
    private final static int MIN_HEIGHT = 200;

    @Inject(method = "use", at = @At("HEAD"), cancellable = true)
    private void useOnBlock(World world, PlayerEntity user, Hand hand, CallbackInfoReturnable<TypedActionResult<ItemStack>> cir){
        BlockHitResult hitResult = (BlockHitResult) user.raycast(4.5, 0f, false);

        if(hitResult.getType() == HitResult.Type.MISS){
            if(user.getBlockY() > MIN_HEIGHT){
                ItemStack itemStack = user.getStackInHand(hand);

                ItemStack skyBottle = new  ItemStack(ModItems.SKY_BOTTLE);

                world.playSound(user, user.getX(), user.getY(), user.getZ(), SoundEvents.ITEM_BOTTLE_FILL, user.getSoundCategory(), 1.0F, 1.0F);

                user.incrementStat(Stats.USED.getOrCreateStat(Items.GLASS_BOTTLE));

                ItemStack resultStack = ItemUsage.exchangeStack(itemStack, user, skyBottle);

                cir.setReturnValue(TypedActionResult.success(resultStack, world.isClient()));
            }
        }
    }
}
