package main.java.counters;

public class BanknoteIntervalCounter extends BanknoteCounter {
    public static void BanknoteIntervalCounter(int from, int to) {
        for (int i = from; i < to; i++) {
            banknoteCounter(i);
        }
    }
}
