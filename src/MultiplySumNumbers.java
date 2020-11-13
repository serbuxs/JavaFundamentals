//Task: Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MultiplySumNumbers {

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите числа: ");

        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(inputNumber.next());
            numbers.add(number);
        }
        System.out.print(numbers);
        /*for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }*/
    }
}