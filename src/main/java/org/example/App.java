package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Simulation simulation = new Simulation(4, 4);
        simulation.setAlive(2,2);


        simulation.printBoard();
        simulation.step();
        simulation.printBoard();
        simulation.step();
        simulation.printBoard();


    }
}
