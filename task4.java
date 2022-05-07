import OOPCalculator.*;
import java.util.Scanner;

public class task4 {

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

        switch (z) {
            case ("+") :
                Plus calcPlus = new Plus(x,y);
                calcPlus.performOperation();
                calcPlus.getResults();
                break;
            case ("-") :
                Minus calcMinus = new Minus(x,y);
                calcMinus.performOperation();
                calcMinus.getResults();
                break;
            case ("/") :
                Divide calcDivide = new Divide(x,y);
                calcDivide.performOperation();
                calcDivide.getResults();
                break;
            case ("*") :
                Multiply calcMultiply = new Multiply(x,y);
                calcMultiply.performOperation();
                calcMultiply.getResults();
                break;
            default: System.out.println("Действие введено не верно!!!"); break;
        }
    }
}