package com.kahzerx.mixins.yummy;

import com.kahzerx.Sharkitty;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.resource.featuretoggle.FeatureSet;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemGroups.class)
public class ItemGroupsMixin {
	@Inject(method = "method_47345", at = @At("TAIL"), remap = false)
	private static void sharkittyIsFood(FeatureSet enabledFeatures, ItemGroup.Entries entries, boolean operatorEnabled, CallbackInfo ci) {
		entries.add(Sharkitty.SHARKITTY_ITEM);
	}
}
