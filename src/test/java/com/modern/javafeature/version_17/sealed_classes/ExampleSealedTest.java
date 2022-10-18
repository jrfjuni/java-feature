package com.modern.javafeature.version_17.sealed_classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExampleSealedTest {

    @Test
    public void runCelestial(){
       final Celestial star      =  new Star();
       final Celestial satellite = new Satellite();
       final Celestial planet    = new Mercury();

       assertEquals(Star.I_AM, star.whatIAm());
       assertEquals(Satellite.I_AM, satellite.whatIAm());
    }

    @Test
    public void runPlanet(){
        final Planet venus    = new Venus();
        final Planet mercury  = new Mercury();
        final Planet earth    = new Earth();
        final Mars mars       = new Mars();
        final Jupiter jupiter = new Jupiter();

        check(venus);
        check(mercury);
        check(earth);
        check(mars);
        check(jupiter);
    }

    private void check(final Planet planet){
        var planetName = planet.getClass().getSimpleName();
        var about      = planet.aboutMe();
        var myNameIs   = planet.myNameIs();

        assertTrue(myNameIs.contains(planetName));
        assertTrue(myNameIs.contains(about));
    }
}
