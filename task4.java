import OOPCalculator.*;
import java.util.Scanner;

/**
 * Task 2 from JAVA advanced
 * @author Abdurahmanov Rushan
 */

public class task4 {
        public static void main(String[] args) {
            //Если правильно понял, то нужно так:
            //Ввод данных через консоль
            Scanner in = new Scanner(System.in);
            System.out.println("Введите Аргумент 1: ");
            double x = in.nextDouble();
            System.out.println("Введите Аргумент 2: ");
            double y = in.nextDouble();
            Scanner in2 = new Scanner(System.in);
            System.out.println("Введите действие '+', '-', '*', '/' : ");
            String z = in2.nextLine();
            in.close();
            in2.close();

            //Передача введенных данных в калькулятор:
            Calculator calc = new Calculator(x, y, z);
            // Вывод результата в консоль:
            calc.Result();
        }
}
