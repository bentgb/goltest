package org.example;

public class Rules {
    public Status nextGeneration(Status cell, Neighbors neighbors) {
        if (cell == Status.ALIVE)
        {  if (underPopulated(neighbors) || overPopulated(neighbors)){
                cell = Status.DEAD;
            }
            }
        else if (deadCellBecomesAliveCell(neighbors)){
                cell = Status.ALIVE;
            }
        return cell;

    }

    private boolean deadCellBecomesAliveCell(Neighbors neighbors) {
        return neighbors.getValue() == 3;

    }

    private boolean overPopulated(Neighbors neighbors) {
        return neighbors.getValue() >3;
    }

    private boolean underPopulated(Neighbors neighbors) {
        return neighbors.getValue() < 2;
    }
}
