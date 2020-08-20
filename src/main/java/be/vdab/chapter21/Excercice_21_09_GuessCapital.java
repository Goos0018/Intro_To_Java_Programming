package be.vdab.chapter21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Excercice_21_09_GuessCapital {

    private static String[][] stateCapitals = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Maryland", "Annapolis"},
            {"Minnesota", "Saint Paul"},
            {"Iowa", "Des Moines"},
            {"Maine", "Augusta"},
            {"Kentucky", "Frankfort"},
            {"Indiana", "Indianapolis"},
            {"Kansas", "Topeka"},
            {"Louisiana", "Baton Rouge"},
            {"Oregon", "Salem"},
            {"Oklahoma", "Oklahoma City"},
            {"Ohio", "Columbus"},
            {"North Dakota", "Bismark"},
            {"New York", "Albany"},
            {"New Mexico", "Santa Fe"},
            {"New Jersey", "Trenton"},
            {"New Hampshire", "Concord"},
            {"Nevada", "Carson City"},
            {"Nebraska", "Lincoln"},
            {"Montana", "Helena"},
            {"North Carolina", "Raleigh"},
            {"Missouri", "Jefferson City"},
            {"Mississippi", "Jackson"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}
    };

    public static void main(String[] args) {

        /*
        // My effort to a solution, not working. because my map accepts Strings and not Strings[]
        // Also tried it with only one forloop, same problem.

        Map<String, String> stateCapitalsMap = new HashMap<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < stateCapitals.length; j++) {
                stateCapitalsMap.put(stateCapitals[i], stateCapitals[j]);
            }
        */

        Map<String, String> stateCapitalsMap = new HashMap<>();
        for (String[] stateCapital : stateCapitals) {
            stateCapitalsMap.put(stateCapital[0], stateCapital[1]);
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a state. Or 'stop' to stop the program.");
        String s = input.nextLine();
        while (!s.equals("stop")) {
            System.out.println(stateCapitalsMap.get(s));
            s = input.nextLine();
        }


    }
}
/*
        // Original program from excercice 8.37
        Scanner input = new Scanner(System.in);
        int correctCount = 0;
        for (int i = 0; i < stateCapitals.length; i++) {
            System.out.print("What is the capital of " + stateCapitals[i][0] + "? ");
            String s = input.nextLine();
            if (s.equalsIgnoreCase(stateCapitals[i][1])) {
                System.out.println("Your answer is correct!");
                correctCount++;
            } else {
                System.out.println("WRONG - The correct answer is " + stateCapitals[i][1]);
            }
        }
        System.out.println("The correct count is " + correctCount);

        */