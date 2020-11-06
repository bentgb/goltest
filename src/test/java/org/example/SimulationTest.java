package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;



public class SimulationTest extends TestCase {

    private Simulation simulation;

    @BeforeEach
    public void setUp(){
        simulation = new Simulation(8, 5);
        simulation.setAlive(2,2);
        simulation.setAlive(3,2);
        simulation.setAlive(4,2);
    }


    @DisplayName("Checking how many alive neighbors that the cell has")
    public void testCountAliveNeighbors() {
        Assertions.assertEquals(2, simulation.countAliveNeighbors(3,2));
    }

    @DisplayName("Making adjustments for the cells at the edges of the board")
    public void testIsALive() {
        Assertions.assertEquals(0, simulation.isALive(9,-1));
    }


}