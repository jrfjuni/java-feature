package com.modern.javafeature.sealed_classes;

import java.math.BigDecimal;

public final class Jupiter implements Planet {

    @Override
    public String aboutMe() {
        return "The God of Gods!";
    }

    @Override
    public BigDecimal size() {
        return BigDecimal.valueOf(139.820);
    }
}
