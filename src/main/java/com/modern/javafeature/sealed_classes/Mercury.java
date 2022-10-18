package com.modern.javafeature.sealed_classes;

import java.math.BigDecimal;

public final class Mercury implements Planet {

    @Override
    public String aboutMe() {
        return "The fastest!";
    }

    @Override
    public BigDecimal size() {
        return BigDecimal.valueOf(4.879);
    }
}
