// Task: Ввести с консоли n - размерность матрицы a [n] [n].
// Задать значения элементов матрицы в интервале значений от -M до M
// с помощью генератора случайных чисел (класс Random)

package Optional;

import java.util.Scanner;

public class opTask2 {

    public static int n = 0; // array size value
    public static int m; // array range value

    public int[][] setArray(int n) {
        int[][] twoDimArray = new int[n][n];
        //System.out.println(twoDimArray);
        return twoDimArray;
    }

    public int[][] getArray(int [][] twoDimArray) {
        System.out.println("Элементы матрицы: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        return twoDimArray;
    }

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        opTask2 input = new opTask2();

        System.out.println("Ввести размерность матрицы: ");
        n = Integer.parseInt(inputNumber.next());

        //input.setArray(n);
        input.getArray(input.setArray(n));

        System.out.println("Задать значение диапазона чисел: ");
    }
}
