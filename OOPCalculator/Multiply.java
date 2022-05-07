package OOPCalculator;

public class Multiply extends Action {
    public Multiply(double argumentOne, double argumentTwo) {
        super(argumentOne, argumentTwo);
    }

    @Override
    public void getResults() {
        System.out.printf("Ответ : " + argumentOne + " * " + argumentTwo + " = " + "%.4f", results);
    }
    @Override
    public void performOperation() {
        results = argumentOne * argumentTwo;
    }
}




