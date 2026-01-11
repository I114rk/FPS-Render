package com.t114.fps;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.hud.VanillaHudElements;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.Identifier;

public class FPSRenderClient implements ClientModInitializer {



    private static void render(GuiGraphics context, DeltaTracker tickCounter) {
        String _fps = "FPS: " + String.valueOf(Minecraft.getInstance().getFps());

        context.drawString(Minecraft.getInstance().font, _fps, 1, 1, RGBAConverter.rgbaToInt(255, 255, 255, 1.0f), true);
    }

    @Override
    public void onInitializeClient() {
        HudElementRegistry.attachElementBefore(VanillaHudElements.CHAT, Identifier.fromNamespaceAndPath(FPSRender.MOD_ID, "before_chat"), FPSRenderClient::render);
    }
}
