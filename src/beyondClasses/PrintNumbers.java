package beyondClasses;

/**
 * Created by Lee N on 28, Thu,Dec,2023.
 */
public class PrintNumbers {
    private final int length = 5;


    public void calculate() {

        int width = 20;

        class Calculator {
            public void multiply() {
                System.out.print(length * width);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }

    public void processData() {
        final int length = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator {
            public int multiply() {
                return length * width * height; // DOES NOT COMPILE
            }
        }
    }

    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate(); // 100
    }
}
