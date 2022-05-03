import java.util.Arrays;
import java.util.Scanner;

/**
 * Task 2 from JAVA advanced
 * @author Abdurahmanov Rushan
 */

public class task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер программы: 1-Калькулятор, 2-Массив");
        int soft = in.nextInt();
        switch (soft) {
            case 1 : calculate(); break;
            case 2 : getALongWord(); break;
            default: System.out.println("Номер программы введен не верно!!!"); break;
        }
    }

    public static void getALongWord () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        String[] array = new String[size];
        System.out.println("Введите " + size + " данных в массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.next();
        }
        Arrays.sort(array);
        System.out.println("Самое длинное слово в масиве: " + array[size - 1]);
    }

    public static void calculate() {
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



