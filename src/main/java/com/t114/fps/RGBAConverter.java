package com.t114.fps;

public class RGBAConverter {
    public static int rgbaToInt(int r, int g, int b, float a) {
        r = Math.max(0, Math.min(255, r));
        g = Math.max(0, Math.min(255, g));
        b = Math.max(0, Math.min(255, b));

        int alpha = Math.max(0, Math.min(255, Math.round(a * 255)));

        return (alpha << 24) | (r << 16) | (g << 8) | b;
    }
}
