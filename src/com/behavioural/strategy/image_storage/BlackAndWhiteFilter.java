package com.behavioural.strategy.image_storage;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.printf("Applying %s to %s\n", getClass().getSimpleName(), fileName);
    }
}
