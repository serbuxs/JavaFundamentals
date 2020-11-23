// Optional Tasks.
// 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
// 2. Вывести числа в порядке возрастания (убывания) значений их длины.
// 3. Вывести на консоль те числа, длина которых больше средней длины по всем числам, а также длину.

package Optional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class opTask1 {

    Scanner inputNumber = new Scanner(System.in);

    public static int numLength; // length of number
    public static int numCount; // count of inputed numbers
    public static int sumLength = 0; // sum of numbers length
    public static int i = 0;

    // create an ArrayList
    //ArrayList<Integer> numbers = new ArrayList<>(); // ArrayList for storage int numbers
    ArrayList<Integer> numbersLen = new ArrayList<>(); // ArrayList for storage length of numbers
    ArrayList<Integer> numbersCompareAvg = new ArrayList<>(); // ArrayList for storage of numbers more than average

    // add elements to ArrayList
    public ArrayList<Integer> addToArray(ArrayList<Integer> numbers, int count) {
        while (i < count) {
            numbers.add(inputNumber.nextInt());
            i++;
        }
        System.out.println("Список введенных чисел: " + numbers);
        return numbers;
    }

        // get length of elements in ArrayList
    public int elemLenArray(ArrayList<Integer> numbers) {
        for (int digits : numbers) {
            String digit = String.valueOf(digits);
            // numbersLen.add(digits); // add element to list
            numLength = digit.length();
            numbersLen.add(numLength); // add element length to list
            sumLength += numLength; // sum of number lengths in ArrayList
        }
        System.out.println("Длины элементов списка: " + numbersLen);
        return sumLength;
    }

    // sort ArrayList elements
    public ArrayList<Integer> sortArray(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }

    // get min element in ArrayList
    public int minElem(ArrayList<Integer> numbers) {
        int min = numbers.get(0);
        return min;
    }

    // get max element in ArrayList
    public int maxElem(ArrayList<Integer> numbers) {
        int max = numbers.get(numbers.size() - 1);
        return max;
    }

    // convert min int to String
    public String minIntToStr(int min) {
        String minStr = String.valueOf(min);
        System.out.println("Самое короткое число: " + min + ". Длина числа: " + minStr.length());
        return minStr;
    }

    // convert max int to String
    public String maxIntToStr(int max) {
        String maxStr = String.valueOf(max);
        System.out.println("Самое длинное число: " + max + ". Длина числа: " + maxStr.length());
        return maxStr;
    }


    // get length of elements in ArrayList
    public void getArgs(int count) {
        /*int i = 0;
        int numLength; // length of number
        int numCount; // count of inputed numbers
        int sumLength = 0; // sum of numbers length

        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(); // ArrayList for storage int numbers
        ArrayList<Integer> numbersLen = new ArrayList<>(); // ArrayList for storage length of numbers
        ArrayList<Integer> numbersCompareAvg = new ArrayList<>(); // ArrayList for storage of numbers more than average

        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите числа: ");*/

        // add elements to ArrayList
        /*while (i < count) {
            numbers.add(inputNumber.nextInt());
            i++;
        }*/

        //System.out.println("Список введенных чисел: " + numbers);

        // sort ArrayList elements
        // Collections.sort(numbers);

        // get length of elements in ArrayList
        /*for (int digits : numbers) {
            String digit = String.valueOf(digits);
            // numbersLen.add(digits); // add element to list
            numLength = digit.length();
            numbersLen.add(numLength); // add element length to list
            sumLength += numLength; // sum of number lengths in ArrayList
        }*/

        //System.out.println("Длины элементов списка: " + numbersLen);

        // get min and max elements in ArrayList
        /*int min = numbers.get(0);
        int max = numbers.get(numbers.size() - 1);*/

        // convert int to String
        /*String minStr = String.valueOf(min);
        String maxStr = String.valueOf(max);*/

        //System.out.println("Задание 1.");
        // display min and max numbers and their lengths
        /*System.out.println("Самое короткое число: " + min + ". Длина числа: " + minStr.length());
        System.out.println("Самое длинное число: " + max + ". Длина числа: " + maxStr.length());*/

        /*System.out.println();
        System.out.println("Задание 2.");*/

        // display sort elements in list by ascending
        System.out.println("Отсортированный по возрастанию список чисел: " + numbers);

        // get count of input numbers and sum of their lengths
        numCount = numbersLen.size();
        //System.out.println(numCount);
        //System.out.println(sumLength);

        // get average length
        int averageLen = Math.round(sumLength / numCount);
        //System.out.println("Среднее значение длин: " + averageLen);

        System.out.println();
        System.out.println("Задание 3.");
        // compare number length with average
        numberCompareAverage(numbers, numbersCompareAvg, averageLen);
    }

    public void numberCompareAverage(ArrayList<Integer> numbers, ArrayList<Integer> numbersCompareAvg, int averageLen) {
        for (int numbersAvg : numbers) {
            String strNumberAvg = String.valueOf(numbersAvg); //convert to String element of numbersAvg
            int numberLen = strNumberAvg.length();
            if (numberLen > averageLen) {
                numbersCompareAvg.add(numberLen);
                System.out.println("Число: " + numbersAvg + ". Длина: " + numberLen + ".");
            }
        }
    }

    public static void main(String[] args) {
        int numLength; // length of number
        int numCount; // count of inputed numbers
        int sumLength = 0; // sum of numbers length

        opTask1 input = new opTask1();

        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(); // ArrayList for storage int numbers
        /*ArrayList<Integer> numbersLen = new ArrayList<>(); // ArrayList for storage length of numbers
        ArrayList<Integer> numbersCompareAvg = new ArrayList<>(); // ArrayList for storage of numbers more than average*/

        //Scanner inputNumber = new Scanner(System.in);

        System.out.print("Введите числа: ");

        input.addToArray(numbers,4);
        input.sortArray(numbers);
        input.elemLenArray(numbers);

        System.out.println("Задание 1.");


        System.out.println();
        System.out.println("Задание 2.");

        // call method with parameter count = 4
        // input.getArgs(4);
    }
}