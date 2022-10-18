package com.modern.javafeature.instance_of;

import com.modern.javafeature.sealed_classes.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class InstanceOfTest {

    @Test
    public void runSatellite(){
       final Celestial satellite = new Satellite();
       assertEquals(satellite.whatIAm(), InstanceOf.celestialInformation(satellite));
    }

    @Test
    public void runPlanet(){
       final Planet earth = new Earth();
       final Planet mars  = new Mars();

       assertEquals(planetResultExpected(earth), InstanceOf.celestialInformation(earth));
       assertEquals(planetResultExpected(mars), InstanceOf.celestialInformation(mars));
    }

    @Test
    public void runStar(){
        final Celestial start = new Star();
        assertEquals(start.whatIAm(), InstanceOf.celestialInformation(start));
    }

    @Test
    public void runIllegalArgumentException(){
        assertThrowsExactly(IllegalArgumentException.class, () -> InstanceOf.celestialInformation(String.class));
    }

    @Test
    private String planetResultExpected(final Planet planet){
        return String.format("%s has %s km.", planet.getClass().getSimpleName(), planet.size());
    }
}
