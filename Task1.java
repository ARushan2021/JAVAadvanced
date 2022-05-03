import java.util.Scanner;

/**
 * Task 1 from JAVA advanced
 * @author Abdurahmanov Rushan
 */

public class Task1 {

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
        double result = 0;
        String Otvet = "Ответ : " + x + " " + z + " " + y + " = ";
        switch (z) {
            case ("+") : result = x + y; System.out.printf(Otvet + "%.4f", result); break;
            case ("-") : result = x - y; System.out.printf(Otvet + "%.4f", result); break;
            case ("*") : result = x * y; System.out.printf(Otvet + "%.4f", result); break;
            case ("/") : result = x / y; System.out.printf(Otvet + "%.4f", result); break;
            default: System.out.println("Действие введено не верно!!!"); break;
        }
    }
}


