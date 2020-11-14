//Task: Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MultiplySumNumbers {

    public int argsCount() {

        return 0;
    }

    public static void main(String[] args) {
        int sum = 0;
        int p = 1;
        int i = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Количество чисел: ");
        int number = Integer.parseInt(inputNumber.next());
        System.out.println("Указано количество - " + number + " чисел.");
        if (number >= 2) {
            System.out.print("Введите " + number + " чисел через пробел: ");
            while (i < number){
                numbers.add(inputNumber.nextInt());
                i++;
            }
            System.out.print("Введенные числа: " + numbers.toString());
        }
        else if (number == 1) {
            System.out.print("Недостаточное количество - " + number + " чисел ввода. Повторите ввод и введите минимум 2 числа.");
        }
        else{
            System.out.print("Не введено ни одного числа. Повторите ввод и введите минимум 2 числа");
        }
    }
}