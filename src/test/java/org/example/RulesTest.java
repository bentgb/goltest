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
        Assert.assertEquals(deadCellWith(Neighbors.THREE_NEIGHBORS), Status.ALIVE);

    }

    @Test
    public  void deadCellWithTwoNeighborsDoNotResurrect(){
        Assert.assertEquals(deadCellWith(Neighbors.TWO_NEIGHBORS), Status.DEAD);

    }

    @Test
    public  void deadCellWithFourNeighborsDoNotResurrect(){
        Assert.assertEquals(deadCellWith(Neighbors.FOUR_NEIGHBORS), Status.DEAD);

    }

    private Status liveCellWith(Neighbors neighbors){
        return nextGeneration(Status.ALIVE, neighbors);
    }

    private Status deadCellWith(Neighbors neighbors){
        return nextGeneration(Status.DEAD, neighbors);
    }

    private Status nextGeneration(Status cellState, Neighbors neighbors ){
        return new Rules().nextGeneration(cellState, neighbors);

    }
}