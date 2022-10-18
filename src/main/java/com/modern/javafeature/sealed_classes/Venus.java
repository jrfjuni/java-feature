package com.modern.javafeature.sealed_classes;

import java.math.BigDecimal;

public final class Venus implements Planet {

    @Override
    public String aboutMe() {
        return "The brightest!";
    }

    @Override
    public BigDecimal size() {
        return BigDecimal.valueOf(12.104);
    }
}
