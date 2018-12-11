package by.artsiomiv.Checkers.view;

import by.artsiomiv.Checkers.Model.Board;
import by.artsiomiv.Checkers.controller.Move;

import java.util.Scanner;

public class GameMenu {


    // Mode 1 - player + player; Mode 2 - player + computer

    private static int mode = 0;
    private static String isWinner = "noWinner";

    public static void gameMenu() {

        Scanner scan0 = new Scanner(System.in);
        String input;
        System.out.println("Welcome to Checkers");
        System.out.println("Before starting a game, please choose a game mode:");

        while (mode == 0) {
            System.out.println("Press '1' to play against another player,");
            System.out.println(" or press '2' to play against a computer.");
            input = scan0.nextLine();
            if (input.equals("1"))
                mode = 1;
            else if (input.equals("2"))
                mode = 2;
            else
                System.out.println("Input error. Please try again to choose the game mode again.");
        }

        System.out.println("Well done! Let's start the game!!!\n");

        // player-player game
        if (mode == 1) {
            while(true) {

                isWinner = Board.checkIfEnd();
                if (isWinner == "noWinner")
                    Move.playerAMove();
                else
                    break;

                isWinner = Board.checkIfEnd();
                if (isWinner == "noWinner")
                    Move.playerBMove();
                else
                    break;
            }

            if (isWinner == "winnerA")
                System.out.println("PLAYER A WON! CONGRATULATIONS!!!");
            else if (isWinner == "winnerB")
                System.out.println("PLAYER B WON! CONGRATULATIONS!!!");

            System.out.println("Thank you for the game! ;)");
        }


        // player-computer game
        if (mode == 2) {
            while(true) {

                isWinner = Board.checkIfEnd();
                if (isWinner == "noWinner")
                    Move.playerAMove();
                else
                    break;

                isWinner = Board.checkIfEnd();
                if (isWinner == "noWinner")
                    Move.playerComputerMove();
                else
                    break;
            }

            if (isWinner == "winnerA")
                System.out.println("PLAYER A WON! CONGRATULATIONS!!!");
            else if (isWinner == "winnerB")
                System.out.println("PLAYER B WON! CONGRATULATIONS!!!");

            System.out.println("Thank you for the game! ;)");
        }

    }

}
