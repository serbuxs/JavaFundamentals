// Optional Tasks.
// 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.


package Optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class opTask1 {

    public static int number;

    public int getArgs(int count) {
        int i = 0;
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner inputNumber = new Scanner(System.in);
        System.out.print("input: ");

        // add elements to ArrayList
        while (i < count) {
            numbers.add(inputNumber.nextInt());
            i++;
        }
        System.out.println(numbers);

        // sort ArrayList elements
        Collections.sort(numbers);
        System.out.println(numbers);

        // get min and max elements in ArrayList
        int min = numbers.get(0);
        int max = numbers.get(numbers.size() - 1);

        // convert int to String
        String minStr = String.valueOf(min);
        String maxStr = String.valueOf(max);

        // display min and max numbers
        System.out.print("Min: " + min + " ");
        System.out.println("Max: " + max + " ");

        // get length of shortest and longest numbers
        System.out.println("Length of shortest number: " + minStr.length());
        System.out.println("Length of longest number: " + maxStr.length());
        return 0;
    }

    // get digit length
    public int getLength() {
        return 0;
    }

    public int findBiggest() {
        return 0;
    }

    public static void main(String[] args) {
        opTask1 input = new opTask1();
        input.getArgs(4);
    }
}
