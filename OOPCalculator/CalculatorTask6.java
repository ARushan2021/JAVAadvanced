package OOPCalculator;

public class CalculatorTask6 {

    double results;
    double argumentOne;
    double argumentTwo;
    String operation;

    public CalculatorTask6(double argumentOne, double argumentTwo, String operation) {
        this.argumentOne = argumentOne;
        this.argumentTwo = argumentTwo;
        this.operation = operation;
    }

    public double Result() {

        try {

            switch (operation) {
                case ("+"):
                    results = argumentOne + argumentTwo;
                    break;
                case ("-"):
                    results = argumentOne - argumentTwo;
                    break;
                case ("/"):
                    if (argumentTwo == 0)
                        throw new ArithmeticException();
                    results = argumentOne / argumentTwo;
                    break;
                case ("*"):
                    results = argumentOne * argumentTwo;
                    break;
                default:
                    System.out.println("Действие введено не верно!!!");
                    break;
            }
            System.out.printf("Ответ : " + argumentOne + " " + operation + " " + argumentTwo + " = " + "%.4f", results);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя : " + e);
        }
        return results;
    }
}


