package com.behavioural.strategy.image_storage;

public class ImageProcessor {
    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
