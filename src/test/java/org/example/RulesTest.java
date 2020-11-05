package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RulesTest {


    @Test
    public void lessThanTwoLiveNeighborsKillsLiveCell(){
        Status cell = Status.ALIVE;
        int neighbors = 1;
        cell = new Rules().nextState(cell, neighbors);
        Assert.assertEquals(cell, Status.DEAD);
    }

    @Test
    public void moreThanOneNeighborLiveCellSurvives(){
        Status cell = Status.ALIVE;
        int neighbors = 2;
        cell = new Rules().nextState(cell, neighbors);
        Assert.assertEquals(cell, Status.ALIVE);
    }

}