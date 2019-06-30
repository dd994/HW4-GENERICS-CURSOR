package main.java.counters;

import static main.java.counters.BanknoteIntervalCounter.banknoteIntervalCounter;

public class BanknoteRuntimeCounter {
    public static void  banknoteRuntimeCounter() {
        long time = System.currentTimeMillis();
        banknoteIntervalCounter(24565,34789);
        System.out.println("The time of program execution is " + (double) (System.currentTimeMillis() - time) / 1000 + "s");

    }
}

