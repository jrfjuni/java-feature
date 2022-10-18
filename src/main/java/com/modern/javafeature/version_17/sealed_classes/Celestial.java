package com.modern.javafeature.version_17.sealed_classes;

public sealed interface Celestial permits Star, Planet, Satellite {

    String whatIAm();
}
