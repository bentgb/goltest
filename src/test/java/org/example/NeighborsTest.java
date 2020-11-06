package org.example;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class NeighborsTest extends TestCase {

    private Neighbors neighbors;



    public void testGetOneNeighbor() {
        Assertions.assertEquals(1, Neighbors.getOneNeighbor());
    }

    public void testGetTwoNeighbor() {
        Assertions.assertEquals(2, Neighbors.getTwoNeighbor());
    }

    public void testGetThreeNeighbor() {
        Assertions.assertEquals(3, Neighbors.getThreeNeighbor());
    }

    public void testGetFourNeighbor() {
        Assertions.assertEquals(4, Neighbors.getFourNeighbor());
    }

    public void testGetFiveNeighbor() {
        Assertions.assertEquals(5, Neighbors.getFiveNeighbor());
    }

    public void testGetSixNeighbor() {
        Assertions.assertEquals(6, Neighbors.getSixNeighbor());
    }

    public void testGetSevenNeighbor() {
        Assertions.assertEquals(7, Neighbors.getSevenNeighbor());
    }
}