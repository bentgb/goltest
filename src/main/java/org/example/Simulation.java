package org.example;

public class Simulation {

        int width;
        int height;
        int[][] board;
        Rules rules = new Rules();

        public Simulation(int width, int height) {
            this.width = width;
            this.height = height;
            this.board = new int[width][height];
        }



        public void printBoard() {
            System.out.println("---");
            for (int y = 0; y < height; y++) {
                String line = "|";
                for (int x = 0; x < width; x++) {
                    if (this.board[x][y] == 0) {
                        line += ".";
                    } else {
                        line += "*";
                    }

                }
                line += "|";
                System.out.println(line);
            }
            System.out.println("---\n");
        }


        public void setAlive(int x, int y) {
            this.board[x][y] = 1;
        }

        public void setDead(int x, int y){
            this.board[x][y] = 0;
        }

        public int countAliveNeighbors (int x, int y){
            int count = 0;
            count += isALive(x - 1,y - 1);
            count += isALive( x, y - 1);
            count += isALive(x + 1, y - 1);

            count += isALive(x - 1, y);
            count += isALive(x + 1, y);

            count += isALive(x - 1, y + 1);
            count += isALive(x, y + 1);
            count += isALive(x + 1, y + 1);

            return count;
        }

        public int isALive(int x, int y){
            if( x < 0 || x >= width){
                return 0;
            }
            if ( y < 0 || y >= height){
                return 0;
            }
            return this.board[x][y];

        }

        public void step(){
        int[][] newboard = new int[width][height];
            for (int y = 0; y < height; y++) {
               for (int x = 0; x < width; x++){
                    int aliveNeighbors =  countAliveNeighbors(x,y);
                    if ( this.board[x][y] == 1) {
                        newboard[x][y] = rules.nextGeneration(Status.ALIVE, aliveNeighbors ).getValue();}
                    else if (this.board[x][y] == 0){
                        newboard[x][y] = rules.nextGeneration(Status.DEAD, aliveNeighbors ).getValue();}

                    }
               }
            this.board = newboard;
            }
            }



