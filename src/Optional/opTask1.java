package Optional;

import java.util.ArrayList;
import java.util.Scanner;

public class opTask1 {

    public static int number;

    public int getArgs(int count) {
        int i = 0;
        // create an ArrayList
        ArrayList<String> numbers = new ArrayList<>();

        Scanner inputNumber = new Scanner(System.in);
        System.out.print("input: ");

        // add elements to ArrayList
        while (i < count) {
            numbers.add(inputNumber.next());
            i++;
        }
        System.out.println(numbers);

        for (String digit: numbers) {
            digit = numbers.get(i);
            int digitLen = String.valueOf(digit).length();
        }

        return 0;
    }

    // get digit length
    public int getLength() {
        return 0;
    }

    public int findBiggest() {
        return 0;
    }

    public static void main(String[] args) {
        opTask1 input = new opTask1();
    }
}
