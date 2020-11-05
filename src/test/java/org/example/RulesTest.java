package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class RulesTest extends TestCase {

    public static final int ALIVE = 1;
    public static final int DEAD = 0;

    @Test
    public void lessThanTwoLiveNeighborsKillsLiveCell(){
        int cell = ALIVE;
        int neighbors = 1;
        cell = new Rules().nextState(cell, neighbors);
        assertEquals(cell, DEAD);

    }

}