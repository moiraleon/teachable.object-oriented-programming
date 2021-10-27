package com.mytube;

public class XVideoEncoder implements VideoEncoder { //highlight interface name command +B jumps to declaration
    @Override
    public void encode(Video video) {
        System.out.println("Encoding video...");
        System.out.println("Done!\n");
    }
}
