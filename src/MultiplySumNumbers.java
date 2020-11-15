//Task: Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;

public class MultiplySumNumbers {

    public static int number;
    public static int sum = 0;
    public static int multi = 1;

    public static void main(String[] args) {
        int i = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Количество чисел: ");
        number = Integer.parseInt(inputNumber.next());
        System.out.println("Указано количество - " + number + " чисел.");
        if (number >= 2) {
            try {
                System.out.print("Введите " + number + " целых чисел через пробел: ");
                while (i < number) {
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
                    multi *= num;
                }
                System.out.println("Произведение введенных чисел: " + multi);
            }
            catch (NumberFormatException exp) {
                System.err.print("Неверный формат введенного значения! Введите целые числа.");
                inputNumber.nextLine();
            } catch (NoSuchElementException exp) {
                System.err.print("Не введено значение! Повторите попытку: ");
                inputNumber.nextLine();
            }
        }
        else if (number == 1) {
            System.out.print("Недостаточное количество - " + number + " чисел ввода. Повторите ввод и введите минимум 2 числа.");
        } else {
            System.out.print("Не введено ни одного числа. Повторите ввод и введите минимум 2 числа");
        }
        System.out.println("Работа программы завершена.");
    }
}