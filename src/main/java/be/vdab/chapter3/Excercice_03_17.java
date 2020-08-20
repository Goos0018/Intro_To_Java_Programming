package be.vdab.chapter3;

import java.util.Random;
import java.util.Scanner;

public class Excercice_03_17 {

    /*
    (Game: scissor, rock, paper) Write a program that plays the popular scissor–rock– paper game.
    (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
    The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
    The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether
    the user or the computer wins, loses, or draws. Here are sample runs:
    scissor (0), rock (1), paper (2): 1
    The computer is scissor. You are rock. You won
       */
    public static void main(String[] args) {
        int pCount = 0;
        int cCount = 0;
        int gameCount = 0;
        while (gameCount < 5) {
            if (playGame(computersMove(), playersMove()) == true) {
                pCount++;
                gameCount++;
            } else {
                cCount++;
                gameCount++;
            }
        }
        System.out.println("\nThe game is finished, you scored "+pCount+" points. The computers scored "+cCount+" points");
    }

    private static boolean playGame(int cMove, int pMove) {
        if (cMove == 0 && pMove == 2) {
            System.out.println("The computer is Rock, you are Scissors. Computer wins!");
            return false;
        } else if (cMove == 0 && pMove == 1) {
            System.out.println("The computer is Rock, you are Paper. You win!");
            return true;
        } else if (cMove == 0 && pMove == 0) {
            System.out.println("The computer is Rock, you are Rock too. It is a draw, try again.");
            playGame(computersMove(), playersMove());
        } else if (cMove == 1 && pMove == 2) {
            System.out.println("The computer is Paper, you are Scissors. You win!");
            return true;
        } else if (cMove == 1 && pMove == 1) {
            System.out.println("The computer is Paper, you are Paper too. It is a draw, try again.");
            playGame(computersMove(), playersMove());
        } else if (cMove == 1 && pMove == 0) {
            System.out.println("The computer is Paper, you are Rock. Computer wins!");
            return false;
        } else if (cMove == 2 && pMove == 2) {
            System.out.println("The computer is Scissors, you are Scissors too. It is a draw, try again.");
            playGame(computersMove(), playersMove());
        } else if (cMove == 2 && pMove == 1) {
            System.out.println("The computer is Scissors, you are Paper. Computer wins!");
            return false;
        } else if (cMove == 2 && pMove == 0) {
            System.out.println("The computer is Scissors, you are Rock. You win!");
        }return true;
    }

    private static int computersMove() {
        Random random = new Random();
        return random.nextInt(3);
    }

    private static int playersMove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your weapon!\nRock (0), Paper(1), Scissor (2): ");
        int pMove = input.nextInt();
        if (pMove < 0 || pMove > 2) {
            System.out.println("Try again, but choose between the available options");
            playGame(computersMove(), playersMove());
        }
        return pMove;
    }
}
