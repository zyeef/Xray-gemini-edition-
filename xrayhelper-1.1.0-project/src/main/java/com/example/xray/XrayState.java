package com.example.xray;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import java.util.HashSet;
import java.util.Set;

public class XrayState {
    public static boolean enabled = false;
    private static final Set<Block> visibleBlocks = new HashSet<>();

    static {
        for (OreType type : OreType.values()) {
            visibleBlocks.addAll(type.getBlocks());
        }
    }

    public static boolean isBlockVisible(BlockState state) {
        if (!enabled) return true;
        return visibleBlocks.contains(state.getBlock());
    }

    public static void toggle() {
        enabled = !enabled;
    }
}
