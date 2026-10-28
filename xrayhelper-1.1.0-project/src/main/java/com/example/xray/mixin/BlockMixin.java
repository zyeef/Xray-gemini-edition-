package com.example.xray.mixin;

import com.example.xray.XrayState;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Block.class)
public abstract class BlockMixin {
    @Inject(method = "shouldRenderFace", at = @At("HEAD"), cancellable = true)
    private static void onShouldRenderFace(BlockState state, BlockGetter level, BlockPos pos, Direction face, BlockPos adjacentPos, CallbackInfoReturnable<Boolean> cir) {
        if (XrayState.enabled) {
            boolean visible = XrayState.isBlockVisible(state);
            cir.setReturnValue(visible);
        }
    }
}
