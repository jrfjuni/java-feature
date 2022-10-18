package com.modern.javafeature.sealed_classes;

import java.math.BigDecimal;

public final class Earth implements Planet {

    @Override
    public String aboutMe() {
        return "The our soil!";
    }

    @Override
    public BigDecimal size() {
        return BigDecimal.valueOf(12.742);
    }
}
