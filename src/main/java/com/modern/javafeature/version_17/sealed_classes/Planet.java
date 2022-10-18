package com.modern.javafeature.version_17.sealed_classes;

public sealed interface Planet extends Celestial
    permits Mercury, Venus, Earth, Mars, Jupiter {

    @Override
    default String whatIAm() {
        return "I'm a Planet!";
    }

    default String myNameIs(){
        return String.format("My name is %s. %s", this.getClass().getSimpleName(), aboutMe());
    }

    String aboutMe();
}
