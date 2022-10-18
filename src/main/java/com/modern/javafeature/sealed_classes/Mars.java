package com.modern.javafeature.sealed_classes;

import java.math.BigDecimal;

public final class Mars implements Planet {

    @Override
    public String aboutMe() {
        return "The red!";
    }

    @Override
    public BigDecimal size() {
        return BigDecimal.valueOf(6.779);
    }
}
