package OOPCalculator;

public abstract class Action {

    double results;
    double argumentOne;
    double argumentTwo;

    public Action(double argumentOne, double argumentTwo) {
        this.argumentOne = argumentOne;
        this.argumentTwo = argumentTwo;
    }

    public void getResults() {
        System.out.printf("Ответ : " + argumentOne + " / " + argumentTwo + " = " + "%.4f", results);
    }
    public void performOperation() {
       results = argumentOne / argumentTwo;
    }
}
