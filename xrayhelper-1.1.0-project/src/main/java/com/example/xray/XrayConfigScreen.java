package com.example.xray;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.network.chat.Component;

public class XrayConfigScreen extends Screen {
    private final Screen parent;

    public XrayConfigScreen(Screen parent) {
        super(Component.literal("Configurações do X-Ray Helper"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        this.addRenderableWidget(Button.builder(
                Component.literal("Lava Visível: " + (XrayConfig.showLava ? "SIM" : "NÃO")),
                button -> {
                    XrayConfig.showLava = !XrayConfig.showLava;
                    button.setMessage(Component.literal("Lava Visível: " + (XrayConfig.showLava ? "SIM" : "NÃO")));
                }
        ).bounds(this.width / 2 - 100, this.height / 4, 200, 20).build());

        this.addRenderableWidget(Button.builder(
                Component.literal("Concluído"),
                button -> this.minecraft.setScreen(this.parent)
        ).bounds(this.width / 2 - 100, this.height / 4 + 48, 200, 20).build());
    }
}
