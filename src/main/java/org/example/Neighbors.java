package org.example;

public enum Neighbors {
    ONE_NEIGHBOR(1),
    TWO_NEIGHBORS(2),THREE_NEIGHBORS(3), FOUR_NEIGHBORS(4), FIVE_NEIGHBORS(5), SIX_NEIGHBORS(6), SEVEN_NEIGHBORS(7);

    private final int neighbor;
    Neighbors(int neighbor) { this.neighbor = neighbor; }
    public int getValue() { return neighbor; }
}
