package com.ibm.javacourse2022.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void getMass() {
        assertEquals(5.97e+24,Planet.EARTH.getMass());
    }

    @Test
    void getRadius() {

    }

    @Test
    void surfaceGravity() {
        assertEquals(3.6996633926090223, Planet.MERCURY.surfaceGravity());

    }
}