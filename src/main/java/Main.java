package main.java;

import static main.java.counters.BanknoteCounter.banknoteCounter;
import static main.java.counters.BanknoteRuntimeCounter.banknoteRuntimeCounter;


public class Main {
    public static void main(String[] args) {
        int number = 88888888;
        banknoteCounter(number);

        //upd

        banknoteRuntimeCounter();
    }
}
