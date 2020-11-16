//Task: Отобразить в окне консоли аргументы командной строки в обратном порядке.

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleArgs {

    public void getArgs(int count) {
        int i = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("input: ");
        while (i < count) {
            numbers.add(inputNumber.nextInt());
            i++;
        }
        System.out.println(numbers.toString());
        /*for ( ; i < count; i++) {
            //System.out.print(numbers[i] + " ");
            System.out.println(numbers.toString());
        }*/
    }

    public static void main(String[] args) {
        ConsoleArgs arg = new ConsoleArgs();
        arg.getArgs(5);
    }
}
