package com.behavioural.strategy;

import com.behavioural.strategy.image_storage.BlackAndWhiteFilter;
import com.behavioural.strategy.image_storage.ImageProcessor;
import com.behavioural.strategy.image_storage.JPEGCompressor;
import com.behavioural.strategy.image_storage.PNGCompressor;

public class Main {
    public static void main(String[] args) {
        var imageProcessor = new ImageProcessor();
        imageProcessor.store("passport.heic", new JPEGCompressor(), new BlackAndWhiteFilter());
        imageProcessor.store("profile.svg", new PNGCompressor(), new BlackAndWhiteFilter());
    }
}
