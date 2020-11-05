package org.example;

import org.junit.Assert;
import org.junit.Test;

public class RulesTest {

    Rules rules = new Rules();


    @Test
    public void lessThanTwoLiveNeighborsKillsLiveCell(){
        Assert.assertEquals(aliveCellWith(Neighbors.ONE_NEIGHBOR), Status.DEAD);
    }

    @Test
    public void moreThanOneNeighborLiveCellSurvives(){
        Assert.assertEquals(aliveCellWith(Neighbors.TWO_NEIGHBORS), Status.ALIVE);
    }

    @Test
    public void moreThanThreeNeighborsKillsLiveCell(){
        Assert.assertEquals(aliveCellWith(Neighbors.FOUR_NEIGHBORS), Status.DEAD);
    }

    @Test
    public void liveCellWithThreeNeighborsSurvives(){
        Assert.assertEquals(aliveCellWith(Neighbors.THREE_NEIGHBORS), Status.ALIVE);
    }

    @Test
    public  void deadCellWithThreeNeighborsBecomesAlive(){
        Assert.assertEquals(deadCellWith(Neighbors.THREE_NEIGHBORS), Status.ALIVE);

    }

    private Status aliveCellWith(Neighbors neighbors){
        return nextGeneration(Status.ALIVE, neighbors);
    }

    private Status deadCellWith(Neighbors neighbors){
        return nextGeneration(Status.DEAD, neighbors);
    }

    private Status nextGeneration(Status cellState, Neighbors neighbors ){
        return rules.nextGeneration(cellState, neighbors);

    }
}