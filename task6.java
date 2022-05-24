import OOPCalculator.*;
import java.io.IOException;
import java.util.Scanner;

/**
 * Task 6 from JAVA advanced
 * @author Abdurahmanov Rushan
 */

public class task6 {
    public static void main(String[] args) throws IOException {
        try {
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

            CalculatorTask6 calc = new CalculatorTask6(x, y, z);
            System.out.printf("Ответ : " + x + " " + z + " " + y + " = " + "%.4f", calc.Result());
        }
        catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя : " + e);
            }
        catch (IllegalArgumentException a) {
                System.out.println("Действие введено не верно : " + a);
            }
        catch (Exception e) {
            System.out.println("Введен некорректный Аргумент: " + e);
        }
    }
}
