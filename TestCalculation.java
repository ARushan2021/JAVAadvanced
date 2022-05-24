import OOPCalculator.CalculatorTask6;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculation {
    //Проверка сложения, значение обоих аргументов положительное
    @Test
      public void TestCalculationPlusPositiveValues() {
          CalculatorTask6 calc = new CalculatorTask6(2.55555, 7.44445, "+");
          Assert.assertEquals(10.0000, calc.Result(), 0);
      }
    //Проверка вычитания, значение обоих аргументов отрицательное
    @Test
    public void TestCalculationMinusNegativeValues() {
        CalculatorTask6 calc = new CalculatorTask6(-2.55555, -7.44445, "-");
        Assert.assertEquals(4.8889, calc.Result(), 0);
    }
    //Проверка умножения, значение первого аргумента отрицательное, второго положительное
    @Test
    public void TestCalculationMultiplication() {
        CalculatorTask6 calc = new CalculatorTask6(-2.5, 10, "*");
        Assert.assertEquals(-25.0000, calc.Result(), 0);
    }
    //Проверка деления, значение первого аргумента положительное, второго отрицательное
    @Test
    public void TestCalculationDivision() {
        CalculatorTask6 calc = new CalculatorTask6(888, -5, "/");
        Assert.assertEquals(-177.6000, calc.Result(), 0);
    }
    //Проверка исключения деления на ноль
    @Test (expected=ArithmeticException.class)
    public void TestDivisionByZero () {
        CalculatorTask6 calc = new CalculatorTask6(500, 0, "/");
        calc.Result();
    }
    //Проверка невалидного значения операции
    @Test (expected=IllegalArgumentException.class)
    public void TestNoValidOperation () {
        CalculatorTask6 calc = new CalculatorTask6(500, 10, "u");
        calc.Result();
    }
}







