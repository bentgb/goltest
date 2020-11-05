package org.example;

public enum Status  {
    ALIVE(1), DEAD(0);

    private final int status;
    Status(int status) { this.status = status; }
    public int getValue() { return status; }
}
