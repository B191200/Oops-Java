import calculator.AdvancedCalculator;
import calculator.CalculatorOperations;


   public class Calculator {
       public static void main(String[] args) {
           CalculatorOperations calculator = new AdvancedCalculator();
           double num1 = 10.0;
           double num2 = 5.0;

           double result = calculator.add(num1, num2);
           System.out.println("Addition: " + result);

           result = calculator.subtract(num1, num2);
           System.out.println("Subtraction: " + result);

           result = calculator.multiply(num1, num2);
           System.out.println("Multiplication: " + result);

           result = calculator.divide(num1, num2);
           System.out.println("Division: " + result);
       }
   }
