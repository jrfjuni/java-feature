package com.modern.javafeature.sealed_classes;

public final class Satellite implements Celestial {

    public static final String I_AM = "I'm a Satellite";

    @Override
    public String whatIAm() {
        return I_AM;
    }
}
