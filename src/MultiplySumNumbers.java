//Task: Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MultiplySumNumbers {

    ArrayList<Integer> numbers = new ArrayList<>();

    /*public void sum(ArrayList numbers) {
        int sum = 0;

    }*/

    public void checkInput(){

    }

    public static void main(String[] args) {
        int sum = 0;
        int p = 1;
        int i = 0;
        MultiplySumNumbers digit = new MultiplySumNumbers();
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
            System.out.println();

            //calculating numbers sum
            for (int num : numbers) {
                sum += num;
            }
            System.out.println("Сумма введенных чисел: " + sum);

            //calculating numbers multiply
            for (int num : numbers) {
                p *= num;
            }
            System.out.println("Произведение введенных чисел: " + p);

            //digit.sum(numbers);
        }
        else if (number == 1) {
            System.out.print("Недостаточное количество - " + number + " чисел ввода. Повторите ввод и введите минимум 2 числа.");
        }
        else{
            System.out.print("Не введено ни одного числа. Повторите ввод и введите минимум 2 числа");
        }
        System.out.println("Работа программы завершена.");
    }
}