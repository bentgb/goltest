package org.example;

import org.junit.Assert;
import org.junit.Test;

public class RulesTest {


    @Test
    public void lessThanTwoLiveNeighborsKillsLiveCell(){
        Assert.assertEquals(liveCellWith(Neighbors.ONE_NEIGHBOR), Status.DEAD);
    }

    @Test
    public void moreThanOneNeighborLiveCellSurvives(){
        Assert.assertEquals(liveCellWith(Neighbors.TWO_NEIGHBORS), Status.ALIVE);
    }

    @Test
    public void moreThanThreeNeighborsKillsLiveCell(){
        Assert.assertEquals(liveCellWith(Neighbors.FOUR_NEIGHBORS), Status.DEAD);
    }

    @Test
    public void liveCellWithThreeNeighborsSurvives(){
        Assert.assertEquals(liveCellWith(Neighbors.THREE_NEIGHBORS), Status.ALIVE);
    }

    @Test
    public  void deadCellWithThreeNeighborsBecomesAlive(){
        Assert.assertEquals(deadCellWith(), Status.ALIVE);

    }

    private Status liveCellWith(Neighbors neighbors){
        return new Rules().nextState(Status.ALIVE, neighbors);
    }

    private Status deadCellWith(){
        return new Rules().nextState(Status.DEAD, Neighbors.THREE_NEIGHBORS);
    }
}