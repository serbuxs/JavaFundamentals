import java.util.Scanner;

public class RandomNumbers {

    public static int randomNumbers(){
        return 0;
    }

    public static void main(String[] args) {
        Scanner numberCount = new Scanner(System.in);
        System.out.println("Сколько случайных чисел будем генерировать: ");
        int count = Integer.parseInt(numberCount.next());
        System.out.println(count + " случайных чисел будет сгенерировано.");
    }
}
