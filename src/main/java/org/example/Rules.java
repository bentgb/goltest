package org.example;

public class Rules {
    public Status nextGeneration(Status cell, Neighbors neighbors) {
        if (cell == Status.ALIVE)
            if (neighbors.getValue() < 2 || neighbors.getValue() > 3){
                cell = Status.DEAD;
            } else if (neighbors.getValue() == 3){
                cell = Status.ALIVE;
            }
        return cell;

    }
}
