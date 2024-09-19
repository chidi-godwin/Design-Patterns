package com.behavioural.strategy.image_storage;

public class JPEGCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.format("Compressing %s file to JPEG\n", fileName);
    }
}
