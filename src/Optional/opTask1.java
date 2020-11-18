// Optional Tasks.
// 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.


package Optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class opTask1 {

    public void getArgs(int count) {
        int i = 0;
        int numLength; // length of number
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> numbersLen = new ArrayList<>();

        Scanner inputNumber = new Scanner(System.in);
        System.out.print("input: ");

        // add elements to ArrayList
        while (i < count) {
            numbers.add(inputNumber.nextInt());
            i++;
        }

        System.out.println("Список введенных чисел: " + numbers);

        // sort ArrayList elements
        Collections.sort(numbers);

        // get length of elements in ArrayList
        for (int digits : numbers) {
            String digit = String.valueOf(digits);
            // numbersLen.add(digits); // add element to list
            numLength = digit.length();
            numbersLen.add(numLength); // add element length to list
        }

        System.out.println("Длины элементов списка: " + numbersLen);

        // get min and max elements in ArrayList
        int min = numbers.get(0);
        int max = numbers.get(numbers.size() - 1);

        // convert int to String
        String minStr = String.valueOf(min);
        String maxStr = String.valueOf(max);

        System.out.println("Задание 1.");
        // display min and max numbers and their lengths
        System.out.println("Самое короткое число: " + min + ". Длина числа: " + minStr.length());
        System.out.println("Самое длинное число: " + max + ". Длина числа: " + maxStr.length());

        System.out.println();
        System.out.println("Задание 2.");

        // display sort elements in list by ascending
        System.out.println("Отсортированный по возрастанию список числе: " + numbers);
    }

    public static void main(String[] args) {
        opTask1 input = new opTask1();

        // call method with parameter count = 4
        input.getArgs(4);
    }
}
