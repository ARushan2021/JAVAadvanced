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
                throw new IllegalArgumentException();
        }
        //Вывод ответа перенес в task6
        //System.out.printf("Ответ : " + argumentOne + " " + operation + " " + argumentTwo + " = " + "%.4f", results);
       return results;
    }
}

