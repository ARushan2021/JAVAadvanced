package OOPCalculator;

public class Calculator {

    double results;
    double argumentOne;
    double argumentTwo;
    String operation;

    public Calculator(double argumentOne, double argumentTwo, String operation) {
        this.argumentOne = argumentOne;
        this.argumentTwo = argumentTwo;
        this.operation = operation;
    }

    public void Result() {

        switch (operation) {
            case ("+"): results = argumentOne + argumentTwo; break;
            case ("-"): results = argumentOne - argumentTwo; break;
            case ("/"): results = argumentOne / argumentTwo; break;
            case ("*"): results = argumentOne * argumentTwo; break;
            default: System.out.println("Действие введено не верно!!!"); break;
            }
            System.out.printf("Ответ : " + argumentOne + " " + operation + " " + argumentTwo + " = " + "%.4f", results);
    }
}





