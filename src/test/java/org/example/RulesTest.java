package org.example;

import org.junit.Assert;
import org.junit.Test;

public class RulesTest {

    Rules rules = new Rules();


    @Test
    public void lessThanTwoLiveNeighborsKillsLiveCell(){
        Assert.assertEquals(nextStateOfAliveCellsWith(Neighbors.ONE_NEIGHBOR), Status.DEAD);
    }

    @Test
    public void moreThanOneNeighborLiveCellSurvives(){
        Assert.assertEquals(nextStateOfAliveCellsWith(Neighbors.TWO_NEIGHBORS), Status.ALIVE);
    }

    @Test
    public void moreThanThreeNeighborsKillsLiveCell(){
        Assert.assertEquals(nextStateOfAliveCellsWith(Neighbors.FOUR_NEIGHBORS), Status.DEAD);
    }

    @Test
    public void liveCellWithThreeNeighborsSurvives(){
        Assert.assertEquals(nextStateOfAliveCellsWith(Neighbors.THREE_NEIGHBORS), Status.ALIVE);
    }

    @Test
    public  void deadCellWithThreeNeighborsBecomesAlive(){
        Assert.assertEquals(nextStateOfDeadCellsWith(Neighbors.THREE_NEIGHBORS), Status.ALIVE);

    }

    @Test
    public  void deadCellWithTwoNeighborsDoNotResurrect(){
        Assert.assertEquals(nextStateOfDeadCellsWith(Neighbors.TWO_NEIGHBORS), Status.DEAD);

    }

    @Test
    public  void deadCellWithFourNeighborsDoNotResurrect(){
        Assert.assertEquals(nextStateOfDeadCellsWith(Neighbors.FOUR_NEIGHBORS), Status.DEAD);

    }

    private Status nextStateOfAliveCellsWith(int neighbors){
        return nextGeneration(Status.ALIVE, neighbors);
    }

    private Status nextStateOfDeadCellsWith(int neighbors){
        return rules.nextGenerationForDeadCells(Status.DEAD, neighbors);
    }

    private Status nextGeneration(Status cellState, int neighbors ){
        return rules.nextGeneration(cellState, neighbors);

    }
}