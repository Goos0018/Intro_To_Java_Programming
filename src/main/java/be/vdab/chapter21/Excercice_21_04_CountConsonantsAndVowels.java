/*
package be.vdab.chapter21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Excercice_21_04_CountConsonantsAndVowels {
    int vowelCount = 0;
    int consonantCount = 0;
    Set<char> charset = new HashSet<char>();



    public static void main(String[] args) {
        String input;
        Scanner file = new Scanner(System.in);

        try {
            input = new File(file.nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (input.hasNextLine()) {
            Scanner s2 = new Scanner(input.nextLine());
            while (s2.hasNext()) {
                String string = s2.next();
                for (int i = 0; i < string.length(); i++) {
                    for (int j = 0; j <)
                }
                    if (string.toLowerCase().charAt(i) == 'a'||'e'||'i'||'o'||'u') {
                        count++;
            }


        }
    }
}
*/
