public class CalculatorTest {
}
public class CalculatorTest {

    public static void main(String[] args) {
        String result = Calculator.Run("2+3*4");

        if (result.equals("14.0")) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED: " + result);
        }
    }
}