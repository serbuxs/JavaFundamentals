// Task: Ввести с консоли n - размерность матрицы a [n] [n].
// Задать значения элементов матрицы в интервале значений от -M до M
// с помощью генератора случайных чисел (класс Random)

package Optional;

import java.util.*;
import java.lang.Object;

public class opTask2 {

    public static int n = 0; // array size value
    public static int m = 20; // array range value
    public static final Random rand = new Random();
    public static int max = 0; // max number in array


    public int[][] setArray(int n) {
        int[][] twoDimArray = new int[n][n];
        //System.out.println(twoDimArray);
        return twoDimArray;
    }

    public int[][] getArray(int[][] twoDimArray) {
        System.out.println("Элементы матрицы: ");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                // fill matrix by random numbers
                twoDimArray[i][j] = (int) (Math.random() * m - m / 2 + 1);
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        return twoDimArray;
    }

    public void updArray(int[][] twoDimArray) {
        //convert array to ArrayList
        List<List<Integer>> lists = new ArrayList<>();
        for (int[] ints : twoDimArray) {
            List<Integer> list = new ArrayList<>();
            for (int i : ints) {
                list.add(i);

            }
            lists.add(list);
        }
        //return Arrays.asList(twoDimArray).indexOf(max); //ArrayUtils.indexOf(twoDimArray, max);
        //System.out.println("max element in array: " + max + " ");
        // System.out.println();
        System.out.println(lists);

        for (int i = 0; i < twoDimArray.length; i++) {
            int max = 0;
            for (int j = 0; j < twoDimArray[i].length; j++) {

                //max = Math.max(max, twoDimArray[i][j]);
                if (twoDimArray[i][j] < twoDimArray[i+1][j+1]){
                    max = twoDimArray[i+1][j+1];
                }
                else if (twoDimArray[i][j] > twoDimArray[i+1][j+1]) {
                    break;
                    }
                }
            System.out.print(max);
        }
    }

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        opTask2 input = new opTask2();

        System.out.println("Ввести размерность матрицы: ");
        n = Integer.parseInt(inputNumber.next());

        //input.setArray(n);
        //input.getArray(input.setArray(n));
        input.updArray(input.getArray(input.setArray(n)));

        // System.out.println("Задать значение диапазона чисел: ");
    }
}
