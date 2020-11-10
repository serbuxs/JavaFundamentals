import java.util.Scanner;

public class RandomNumbers {

    public static int number;
    int[] array = new int[number];

    public int[] setArray() {
        for (int i = 0; i < number; i++) {
            array[i] = (int) (Math.random() * 20);
            System.out.println(array[i]);
        }
        return array;
    }


    // display array of numbers with transition on new line
    public void displayArrayNewLine(int[] array) {
        for (int i = 0; i < number; i++) {
            System.out.println(array[i]);
        }
    }

    // display array of numbers inline
    public void displayArrayLine(int[] array) {
        for (int i = 0; i < number; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Сколько случайных чисел будем генерировать: ");
        number = Integer.parseInt(inputNumber.next());
        System.out.println(number + " случайных чисел сгенерировано.");

        RandomNumbers randNum = new RandomNumbers();
        randNum.setArray();
        //randNum.displayArrayNewLine();
        //randNum.displayArrayLine();
    }
}
