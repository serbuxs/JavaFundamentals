//Task: Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ConsoleArgs {

    public void getArgs(int count) {
        int i = 0;
        // create an ArrayList
        ArrayList<String> numbers = new ArrayList<>();

        Scanner inputNumber = new Scanner(System.in);
        System.out.print("input: ");

        // add elements to ArrayList
        while (i < count) {
            numbers.add(inputNumber.next());
            i++;
        }
        System.out.println(numbers);

        // reverse the ArrayList
        Collections.reverse(numbers);
        System.out.println(numbers);
    }

    public static void main(String[] args) {
        ConsoleArgs arg = new ConsoleArgs();
        arg.getArgs(5);
    }
}
