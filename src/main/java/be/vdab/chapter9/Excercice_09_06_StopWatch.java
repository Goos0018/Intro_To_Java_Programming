package be.vdab.chapter9;

import java.time.LocalDateTime;
import java.util.Random;

public class Excercice_09_06_StopWatch {

    public static void main(String[] args) {

        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        Excercice_09_06_StopWatch test = new Excercice_09_06_StopWatch();
        test.start();

        for (int i = 0; i < array.length - 1; i++) {                // invoer = array met integers

            int minIndex = i;                               // zoek kleinste in de rest van de array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[i];                           // verwissel waarden
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        test.stop();
        System.out.println(test.startTime);
        System.out.println(test.endTime);
        System.out.println(test.getElapsedTime());

    }

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Excercice_09_06_StopWatch() {
        this.startTime = LocalDateTime.now();

    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = LocalDateTime.now();
    }

    public void stop() {
        this.endTime = LocalDateTime.now();
    }

    public int getElapsedTime() {
        return (endTime.getNano() * 1000000 - startTime.getNano() * 1000000);

    }
}
