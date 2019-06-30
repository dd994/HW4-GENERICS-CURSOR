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

        Iterator<Integer> iterator = banknotes.iterator(); //визначаємо ітератор
        Integer number = iterator.next(); //присвоємо значення номіналу -  поточному елементу списку
        int currNum = amount; //об"явимо змінну, яка спочатку дорівнюватиме введеній сумі

        while (iterator.hasNext()) { //поки є наступний елемент :
            int meter = currNum / number; //об"являємо лічильник, результатом буде кількість націло поділених купюр
            if (currNum >= number) { //якщо поточне число дорівнює чи більша за номінал
                System.out.println(number + " - " + meter); //друкуємо результат
                currNum %= number;//далі в цьому ж  циклі отримуємо залишок від ділення на ціло і присвоємо цей залишок поточному числу
            }
            if (currNum < number) { //якщо поточно число менше поточного номіналу - змінюємо номінал
                number = iterator.next();
            }
            if (currNum == 0) { //якщо поточне число дорівнює нулю - нема що зрівнювати з номіналом - виход з циклу
                break;
            }
        }
    }
}


