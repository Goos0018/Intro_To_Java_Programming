package be.vdab.chapter2;

import java.util.Scanner;

public class Excercice_02_06 {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int position1 = 1;
        int position2 = 1;
        int position3 = 1;

        System.out.println("Enter a number between 0 and 1000");
        number = input.nextInt();
        while (number < 0 || number > 1000) {
            System.out.println("Enter a number between 0 and 1000");
            number = input.nextInt();
        }


        if (number / 100 != 0) {
            position1 = number / 100;
            System.out.println(position1);
        }
        if ((number / 10) % 10 != 0) {
            position2 = (number / 10) % 10;
            System.out.println(position2);
        }
        if ((number % 10) != 0) {
            position3 = (number % 10);
            System.out.println(position3);
        }

        int result = position1 * position2 * position3;
        System.out.println("The multiplication of all digits in " + number + " is " + result);
    }

}