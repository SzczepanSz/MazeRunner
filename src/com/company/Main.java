package com.company;
import java.lang.Process;

public class Main {

    public static void main(String[] args) {
        String move = "stop";
        Maze myMap = new Maze();
        myMap.intro();
        myMap.printMap();
        boolean canI = false;


        do{
            myMap.canIMoveUp();
            myMap.canIMoveDown();
            myMap.canIMoveLeft();
            myMap.canIMoveRight();
            myMap.printMap();

            move = myMap.userMove();


            switch (move) {
                case "W":
                    if (myMap.canIMoveUp()){
                        myMap.moveUp();
                    }
                    if (myMap.isThereAPit(move)){
                        myMap.jumpOverPit(move);
                    }
                    break;
                case "S":
                    if (myMap.canIMoveDown()){
                        myMap.moveDown();
                    }
                    if (myMap.isThereAPit(move)){
                        myMap.jumpOverPit(move);
                    }
                    break;
                case "A":

                    if (myMap.canIMoveLeft()){
                        myMap.moveLeft();
                    }
                    if (myMap.isThereAPit(move)){
                        myMap.jumpOverPit(move);
                    }
                    break;
                case "D":

                    if (myMap.canIMoveRight()) {
                        myMap.moveRight();
                    }
                    if (myMap.isThereAPit(move)){
                        myMap.jumpOverPit(move);
                    }
                    break;
            }




            }while (myMap.canIMoveRight()|| myMap.canIMoveLeft()||myMap.canIMoveUp()|| myMap.canIMoveDown());
    }
}
