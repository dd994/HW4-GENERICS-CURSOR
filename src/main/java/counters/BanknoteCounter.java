package main.java.counters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BanknoteCounter {

    public static void banknoteCounter(int amount) {

        List<Integer> banknotes = new ArrayList<>();
        banknotes.add(500);
        banknotes.add(200);
        banknotes.add(100);
        banknotes.add(50);
        banknotes.add(20);
        banknotes.add(10);
        banknotes.add(5);
        banknotes.add(2);
        banknotes.add(1);

        Iterator<Integer> iterator = banknotes.iterator(); //define an iterator
        Integer number = iterator.next(); //assign the value of the nominal value to the current item in the list
        int currNum = amount; //declare a variable that initially equals the amount entered

        while (iterator.hasNext()) { //while there is the following element:
            int meter = currNum / number; //declare a counter, the result will be the amount of entirely divided banknotes
            if (currNum >= number) { //if the current number is equal to or greater than the nominal value
                System.out.println(number + " - " + meter); //print the result
                currNum %= number;// in the same cycle we get the remainder from the division by integer and assign this remainder to the current number
            }
            if (currNum < number) { // if the current number is less than the current denomination - change the denomination
                number = iterator.next();
            }
            if (currNum == 0) {
                break;
            }
        }
    }
}


