package OOPCalculator;

public class Minus extends Action {

    public Minus(double argumentOne, double argumentTwo) {
        super(argumentOne, argumentTwo);
    }
    @Override
    public void getResults() {
        System.out.printf("Ответ : " + argumentOne + " - " + argumentTwo + " = " + "%.4f", results);
    }
    @Override
    public void performOperation() {
        results = argumentOne - argumentTwo;
    }
}