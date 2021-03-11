package com.gemz.dev.model.util;

import java.util.Random;

public class RandomPrivateKeyGenerator {

    private int leftLimit = 48;
    private int rightLimit = 102;
    private int targetStringLength = 64;

    public String getRandomPrivateKey() {
        Random random = new Random();
        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
