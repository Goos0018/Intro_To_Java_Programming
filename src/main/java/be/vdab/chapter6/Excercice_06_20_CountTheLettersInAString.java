package be.vdab.chapter6;

import java.util.Scanner;

public class Excercice_06_20_CountTheLettersInAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        System.out.println("The string you entered has " + countLetters(input.nextLine()) + " characters in it.");
    }
    public static int countLetters(String s){
        s = s.replaceAll(" ","");
        char[] count = s.toCharArray();
        return count.length;
    }
}
