package com.example.xray.mixin;

import com.example.xray.XrayConfig;
import com.example.xray.XrayState;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LiquidBlock.class)
public abstract class LiquidMixin {
    @Inject(method = "shouldRenderFace", at = @At("HEAD"), cancellable = true)
    private static void onShouldRenderFace(BlockState state, CallbackInfoReturnable<Boolean> cir) {
        if (XrayState.enabled) {
            if (state.is(Blocks.LAVA) && !XrayConfig.showLava) {
                cir.setReturnValue(false);
            } else if (state.is(Blocks.WATER) && !XrayConfig.showWater) {
                cir.setReturnValue(false);
            }
        }
    }
}
