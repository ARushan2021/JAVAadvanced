import java.util.Random;
import static java.lang.System.exit;

/**
 * Task 3 part 1 from JAVA advanced
 * @author Abdurahmanov Rushan
 */

public class task3part1 {

    public static void main(String args[]) {

        System.out.println("Заполняем массив случайными целыми числами от -10 до 10:");
        int[] array = new Random().ints(20, -10, 10).toArray();
        for (int value : array) {
            System.out.print(value + " ");
        }
        int countPositive = 0;
        int countNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if      (array[i] > 0) {countPositive++;}
            else if (array[i] < 0) {countNegative++;}
        }
        if (countPositive == 0){
            System.out.println("\nЭлементы массива не удовлитворяют требованиям задания, отсутствуют положительные элементы массива");
            exit(1);
        }
        else if (countNegative == 0){
            System.out.println("\nЭлементы массива не удовлитворяют требованиям задания, отсутствуют отрицательные элементы массива");
            exit(1);
        }

        System.out.print("\n\nМинимально положительный элемент массива : ");
        int minPositive = 10;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] <= minPositive) & (array[i] > 0)) {
                minPositive = array[i];
            }
        }
        System.out.println(minPositive);

        System.out.print("Максимально отрицательный элемент массива : ");
        int minNegative = -1;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] <= minNegative) & (array[i] < 0)) {
                minNegative = array[i];
            }
        }
        System.out.println(minNegative);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minPositive) {
                array[i] = minNegative;
            }
            else if (array[i] == minNegative){
                array[i] = minPositive;
            }
        }
        System.out.println("\nМассив с измененными максимально отрицательными и минимально положительными элементами: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}



