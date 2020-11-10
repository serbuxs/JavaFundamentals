import java.util.Scanner;

public class RandomNumbers {

    public void arrRandomNumbers(int number){
        int elemNumber = number;

        int[] array = new int[elemNumber];
        for (int i = 0; i < elemNumber; i++) {
            array[i] = (int)(Math.random() * 20);
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Сколько случайных чисел будем генерировать: ");
        int number = Integer.parseInt(inputNumber.next());
        System.out.println(number + " случайных чисел будет сгенерировано.");

        RandomNumbers randNum = new RandomNumbers();
        randNum.arrRandomNumbers(number);
    }
}
