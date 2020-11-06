package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Simulation simulation = new Simulation(8, 5);
        simulation.setAlive(2,2);
        simulation.setAlive(3,2);
        simulation.setAlive(4,2);

        simulation.printBoard();
        simulation.step();
        simulation.printBoard();
        simulation.step();
        simulation.printBoard();


    }
}
