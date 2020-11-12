//Task: Ввести число от 1 до 12.
// Вывести на консоль название месяца, соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MonthNumber {

    public static int number; //month number

    public void checkMonth() {
        System.out.print("Выбран месяц - ");
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
                break;
        }
    }

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите число от 1 до 12, чтобы определить месяц: ");

        //input number checking

        while (inputNumber.hasNext()) {
            try {
                number = Integer.parseInt(inputNumber.next());

                MonthNumber month = new MonthNumber();

                if (number > 0 && number <= 12) {
                    //check month number
                    month.checkMonth();
                    System.exit(0); //finish process after positive input
                } else if (number < 0) {
                    System.out.print("Введено отрицательное значение номера месяца. Повторите ввод, используя значения от 1 до 12: ");
                    inputNumber.nextLine();
                } else if (number == 0) {
                    System.out.print("Введено значение номера месяца - ноль. Повторите ввод, используя значения от 1 до 12: ");
                    inputNumber.nextLine();
                } else {
                    System.out.print("Введено слишком большое значение номера месяца. Повторите ввод, используя значения от 1 до 12: ");
                    inputNumber.nextLine();
                }
            } catch (NumberFormatException exp) {
                System.err.print("Неверный формат введенного значения! Повторите ввод, используя значения от 1 до 12: ");
                inputNumber.nextLine();
            } catch (NoSuchElementException exp) {
                System.err.print("Не введено значение! Повторите попытку: ");
                inputNumber.nextLine();
            }
        }
    }
}
