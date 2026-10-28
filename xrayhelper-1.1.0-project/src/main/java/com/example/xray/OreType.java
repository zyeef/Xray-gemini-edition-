package com.example.xray;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import java.util.Set;

public enum OreType {
    DIAMOND("Diamante", Set.of(Blocks.DIAMOND_ORE, Blocks.DEEPSLATE_DIAMOND_ORE, Blocks.DIAMOND_BLOCK)),
    ANCIENT_DEBRIS("Detritos Ancestrais", Set.of(Blocks.ANCIENT_DEBRIS, Blocks.NETHERITE_BLOCK)),
    GOLD("Ouro", Set.of(Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.NETHER_GOLD_ORE, Blocks.GOLD_BLOCK)),
    IRON("Ferro", Set.of(Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE, Blocks.IRON_BLOCK)),
    EMERALD("Esmeralda", Set.of(Blocks.EMERALD_ORE, Blocks.DEEPSLATE_EMERALD_ORE, Blocks.EMERALD_BLOCK)),
    LAPIS("Lápis-Lazúli", Set.of(Blocks.LAPIS_ORE, Blocks.DEEPSLATE_LAPIS_ORE, Blocks.LAPIS_BLOCK)),
    REDSTONE("Redstone", Set.of(Blocks.REDSTONE_ORE, Blocks.DEEPSLATE_REDSTONE_ORE, Blocks.REDSTONE_BLOCK)),
    COAL("Carvão", Set.of(Blocks.COAL_ORE, Blocks.DEEPSLATE_COAL_ORE, Blocks.COAL_BLOCK)),
    UTILITY("Especiais", Set.of(Blocks.CHEST, Blocks.TRAPPED_CHEST, Blocks.ENDER_CHEST, Blocks.SPAWNER, Blocks.RAW_IRON_BLOCK, Blocks.RAW_GOLD_BLOCK, Blocks.RAW_COPPER_BLOCK));

    private final String name;
    private final Set<Block> blocks;

    OreType(String name, Set<Block> blocks) {
        this.name = name;
        this.blocks = blocks;
    }

    public String getName() {
        return name;
    }

    public Set<Block> getBlocks() {
        return blocks;
    }
}
