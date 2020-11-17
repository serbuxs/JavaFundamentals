//Task: Вывести заданное количество случайных чисел
// с переходом и без перехода на новую строку

import java.util.Scanner;

public class RandomNumbers {

    public static int number;
    int[] array = new int[number];

    // output elements of Array
    public void setArray() {
        System.out.print("Элементы массива без перехода на новую строку: ");
        for (int i = 0; i < number; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Элементы массива с переходом на новую строку: \n");
        for (int i = 0; i < number; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Количество случайных чисел для генерации: ");

        // number input
        number = Integer.parseInt(inputNumber.next());
        System.out.println(number + " - случайных чисел сгенерировано.");

        // create class object
        RandomNumbers randNum = new RandomNumbers();
        // call method
        randNum.setArray();
    }
}
