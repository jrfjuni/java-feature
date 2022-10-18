package com.modern.javafeature.instance_of;

import com.modern.javafeature.sealed_classes.Planet;
import com.modern.javafeature.sealed_classes.Satellite;
import com.modern.javafeature.sealed_classes.Star;

public class InstanceOf {

    public static String celestialInformation(final Object object){

        if(object instanceof Satellite satellite)
            return satellite.whatIAm();

        if(object instanceof Planet planet)
            return String.format("%s has %s km.", planet.getClass().getSimpleName(), planet.size());

        if(object instanceof Star star)
            return star.whatIAm();

        throw new IllegalArgumentException();
    }
}
