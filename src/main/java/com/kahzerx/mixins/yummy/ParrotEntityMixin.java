package com.kahzerx.mixins.yummy;

import com.kahzerx.SharkittyItem;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ParrotEntity.class)
public class ParrotEntityMixin {
	@ModifyExpressionValue(method = "interactMob", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
	private boolean sharkittyIsCookie(boolean boolValue, /* parent method parameters -> */ PlayerEntity player, Hand hand) {
		return boolValue || player.getStackInHand(hand).getItem() instanceof SharkittyItem;
	}
}
