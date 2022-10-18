package com.modern.javafeature.sealed_classes;

public final class Star implements Celestial {

    public static final String I_AM = "I'm a Star";

    @Override
    public String whatIAm() {
        return I_AM;
    }
}
