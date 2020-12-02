// Task: Ввести с консоли n - размерность матрицы a [n] [n].
// Задать значения элементов матрицы в интервале значений от -M до M
// с помощью генератора случайных чисел (класс Random)
// 1. Упорядочить строки (столбцы) матрицы
// в порядке возрастания значений элементов k-го столбца (строки).

package Optional;

import java.util.*;

public class opTask2 {

    public static int n = 0; // init array size value
    public static int m = 10; // array range value
    public static int column = 1;
    public static final Random rand = new Random();

    public int[][] getArray(int n) {
        // create new array
        int[][] twoDimArray = new int[n][n];
        // fill array by random numbers
        System.out.println("Элементы матрицы: ");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = (int) (Math.random() * m - m / 2 + 1);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        return twoDimArray;
    }

    public void sortArray(int[][] twoDimArray) {
        // sort array elements using bubble sort
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int k = i + 1; k < twoDimArray.length; k++) {
                if (twoDimArray[i][column] > twoDimArray[k][column]) {
                    for (int j = 0; j < twoDimArray.length; j++) {
                        int temp = twoDimArray[i][j];
                        twoDimArray[i][j] = twoDimArray[k][j];
                        twoDimArray[k][j] = temp;
                    }
                }
            }
        }

        System.out.println();

        // display sorted array
        System.out.println("Матрица после сортировки: ");
        for (int i = 0; i < twoDimArray.length; i++ ){
            for (int j = 0; j < twoDimArray.length; j++ ) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        opTask2 input = new opTask2();

        System.out.println("Ввести размерность матрицы: ");
        n = Integer.parseInt(inputNumber.next());

        input.sortArray(input.getArray(n));

        // System.out.println("Задать значение диапазона чисел: ");
    }
}
