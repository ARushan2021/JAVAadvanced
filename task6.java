import OOPCalculator.*;

import java.util.Scanner;

/**
 * Task 6 from JAVA advanced
 * @author Abdurahmanov Rushan
 */

public class task6 {
    public static void main(String[] args) {
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
        calc.Result();
    }
}