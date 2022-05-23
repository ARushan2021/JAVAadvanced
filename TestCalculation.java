import OOPCalculator.CalculatorTask6;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculation {

    @Test
      public void TestCalculationPlusPositiveValues() {
          CalculatorTask6 calc = new CalculatorTask6(2.55555, 7.44445, "+");
          Assert.assertEquals(10.0000, calc.Result(), 0);
      }

    @Test
    public void TestCalculationMinusNegativeValues() {
        CalculatorTask6 calc = new CalculatorTask6(-2.55555, -7.44445, "-");
        Assert.assertEquals(4.8889, calc.Result(), 0);
    }

    @Test
    public void TestCalculationMultiplication() {
        CalculatorTask6 calc = new CalculatorTask6(-2.5, -10, "*");
        Assert.assertEquals(25.0000, calc.Result(), 0);
    }

    @Test
    public void TestCalculationDivision() {
        CalculatorTask6 calc = new CalculatorTask6(888, 5, "/");
        Assert.assertEquals(177.6000, calc.Result(), 0);
    }
    //При "аргументе 1" = 10 и "аргументе 2" = 1, ожидаемый результат будет = 0, только если operation - невалидное значение.
    @Test
    public void TestCalculationNotValidAction () {
        CalculatorTask6 calc = new CalculatorTask6(10, 1, "r");
        Assert.assertEquals(0, calc.Result(), 0);
    }

    //"calc.Result();" -  возвращает переменую типа double.
    // При запуске теста получаю ошибку - "java.lang.AssertionError: Expected exception: java.lang.ArithmeticException"
    //(ожидаемый результат не исключение типа ArithmeticException)
    //Обойти ошибку к сожалению не получилось.
    //Если в тесте прописываю: int a = 10 / 0;, то тест отрабатывает кооректно
    @Test (expected=ArithmeticException.class)
    public void TestDivisionByZero () {
        CalculatorTask6 calc = new CalculatorTask6(500, 0, "/");
        calc.Result();
    }
}


//String b = String.valueOf(calc.Result());
//InputStreamReader st = new InputStreamReader(System.in);
//BufferedReader a = new BufferedReader(st);
//String b = a.readLine();
//System.out.println("\n переменная = " + b);
//String b = String.valueOf(calc.Result());
//System.out.println("переменная = " + b);






