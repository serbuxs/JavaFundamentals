import java.util.Scanner;

public class MultiplySumNumbers {
    public static int number_a;
    public static int number_b;
    public static int number_c;
    public static int number_d;

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите числа: ");
        number_a = inputNumber.nextInt();
        number_b = inputNumber.nextInt();
        number_c = inputNumber.nextInt();
        number_d = inputNumber.nextInt();
        System.out.print(number_a + number_b + number_c + number_d);
    }
}
