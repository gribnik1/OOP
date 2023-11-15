public class Main {
    public static void main(String[] args) {
        int intNum1 = 10;
        int intNum2 = 5;
        double doubleNum1 = 3.5;
        double doubleNum2 = 2.0;

        double sum1 = Calculator.sum(intNum1, intNum2);
        double sum2 = Calculator.sum(doubleNum1, doubleNum2);

        double multiply1 = Calculator.multiply(intNum1, intNum2);
        double multiply2 = Calculator.multiply(doubleNum1, doubleNum2);

        double divide1 = Calculator.divide(intNum1, intNum2);
        double divide2 = Calculator.divide(doubleNum1, doubleNum2);

        double subtraction1 = Calculator.subtraction(intNum1, intNum2);
        double subtraction2 = Calculator.subtraction(doubleNum1, doubleNum2);

        System.out.println("Sum: " + sum1 + ", " + sum2);
        System.out.println("Multiply: " + multiply1 + ", " + multiply2);
        System.out.println("Divide: " + divide1 + ", " + divide2);
        System.out.println("Subtraction: " + subtraction1 + ", " + subtraction2);
    }
}