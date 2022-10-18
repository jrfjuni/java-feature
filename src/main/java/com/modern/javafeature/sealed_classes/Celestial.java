package com.modern.javafeature.sealed_classes;

public sealed interface Celestial permits Star, Planet, Satellite {

    String whatIAm();
}
