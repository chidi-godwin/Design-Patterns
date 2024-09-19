package com.behavioural.strategy.image_storage;

public class PNGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.printf("Compressing %s to PNG\n", fileName);
    }
}
