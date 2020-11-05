package org.example;

public class Rules {
    public Status nextState(Status cell, Neighbors neighbors) {
        if (cell == Status.ALIVE)
            if (neighbors.getValue() < 2 || neighbors.getValue() > 3){
                cell = Status.DEAD;
            }
        return cell;

    }
}
