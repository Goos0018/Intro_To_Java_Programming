package be.vdab.chapter4;

import java.util.Random;

public class Excercice_04_25 {
    public static void main(String[] args) {

        System.out.println("Your new numberplate is " + letter() + letter() + letter() + " "
                + digit() + digit() + digit() + digit());
    }

    public static char letter() {
        Random random = new Random();
        int i = random.nextInt(100);
        while (i < 65 || i > 90) {
            i = random.nextInt(100);
        }
        return (char) i;

    }

    public static int digit() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
