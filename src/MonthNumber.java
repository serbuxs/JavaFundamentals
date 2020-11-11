//Task: Ввести число от 1 до 12.
// Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class MonthNumber {

    public static int number; //month number

    public void checkMonth() {
        System.out.print(" - ");
        switch (number) {
            case 1:
                System.out.print("Январь");
                break;
            case 2:
                System.out.print("Февраль");
                break;
            case 3:
                System.out.print("Март");
                break;
            case 4:
                System.out.print("Апрель");
                break;
            case 5:
                System.out.print("Май");
                break;
            case 6:
                System.out.print("Июнь");
                break;
            case 7:
                System.out.print("Июль");
                break;
            case 8:
                System.out.print("Август");
                break;
            case 9:
                System.out.print("Сентябрь");
                break;
            case 10:
                System.out.print("Октябрь");
                break;
            case 11:
                System.out.print("Ноябрь");
                break;
            case 12:
                System.out.print("Декабрь");
                break;
            default:
                System.out.print("Введено неверное значение месяца. Повторите ввод.");
        }

    }

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12, чтобы определить месяц: ");
        number = Integer.parseInt(inputNumber.next());

        MonthNumber month = new MonthNumber();
        month.checkMonth();
    }
}
