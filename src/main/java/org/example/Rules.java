package org.example;

public class Rules {

    public Status nextGeneration(final Status currentState, final int neighbors) {
        Status nextState = currentState;

            if (neighbors < 2 || neighbors > 3) {
                nextState = Status.DEAD;
            } else if (neighbors == 3) {
                nextState = Status.ALIVE;

            }
        return nextState;

        }


    public Status nextGenerationForDeadCells(final Status currentState, final int neighbors) {
        Status nextState = currentState;

            if (neighbors < 2 || neighbors > 3) {
                nextState = Status.DEAD;
            } else if (neighbors == 3) {
                nextState = Status.ALIVE;
            }
        return nextState;
        }
    }






