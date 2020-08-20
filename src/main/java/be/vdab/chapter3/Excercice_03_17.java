package be.vdab.chapter3;

import java.util.Random;
import java.util.Scanner;

public class Excercice_03_17 {
    public static void main(String[] args) {



    }

    public int computersMove() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public  int playersMove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Rock (0), Paper(1), Scissor (3): ");
        int move = input.nextInt();
        while (move != (0 || 1 || 2)){
            System.out.println("Try again, but choose oneRock (0), Paper(1), Scissor (3): ");
            int move = input.nextInt();
        }
    }
}
