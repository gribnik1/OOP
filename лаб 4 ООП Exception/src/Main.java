import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Calculate {
    public static double sum(double... numbers) {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    public static double subtract(double... numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    public static double multiply(double... numbers) {
        double result = 1;
        for (double number : numbers) {
            result *= number;
        }
        return result;
    }

    public static double divide(double... numbers) throws ArithmeticException {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                throw new ArithmeticException("Ошибка: деление на ноль");
            }
            result /= numbers[i];
        }
        return result;
    }
}

interface Discriminant {
    double calculate(double a, double b, double c);
}

class Parser {
    public static void parse(String path) {
        File file = new File(path);
        try {
            Scanner scanner = new Scanner(file);
            int taskNumber = 1;
            FileWriter writer = new FileWriter("output.txt");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("Решите уравнение:")) {
                    String equation = line.substring(line.indexOf(":") + 1).trim();
                    writer.write("===Task " + taskNumber + "===\n");
                    writer.write("Решите уравнение: " + equation + "\n");
                    String[] parts = equation.split("=");
                    String variable = parts[0].trim();
                    String expression = parts[1].trim();
                    try {
                        char[] operators = {'+', '-', '*', '/'};
                        double result = evaluateExpression(expression, operators);
                        writer.write(variable + " = " + result + "\n");
                    } catch (Exception e) {
                        writer.write("Невозможно вычислить решение уравнения\n");
                    }
                    taskNumber++;
                } else if (line.startsWith("Найдите значение выражения:")) {
                    String expression = line.substring(line.indexOf(":") + 1).trim();
                    writer.write("===Task " + taskNumber + "===\n");
                    writer.write("Найдите значение выражения: " + expression + "\n");
                    try {
                        char[] operators = {'+', '-', '*', '/'};
                        double result = evaluateExpression(expression, operators);
                        writer.write(expression + " = " + result + "\n");
                    } catch (Exception e) {
                        writer.write("Невозможно вычислить значение выражения\n");
                    }
                    taskNumber++;
                } else if (line.startsWith("Найдите решение квадратного уравнения:")) {
                    String equation = line.substring(line.indexOf(":") + 1).trim();
                    writer.write("===Task " + taskNumber + "===\n");
                    writer.write("Найдите решение квадратного уравнения: " + equation + "\n");
                    String[] parts = equation.split("=");
                    String quadraticExpression = parts[0].trim();
                    try {
                        char[] operators = {'+', '-', '*', '/', '^'};
                        double result = evaluateExpression(quadraticExpression, operators);
                        double discriminant = calculateDiscriminant(result);
                        if (discriminant >= 0) {
                            double root1 = (-result + Math.sqrt(discriminant)) / (2 * result);
                            double root2 = (-result - Math.sqrt(discriminant)) / (2 * result);
                            writer.write("x = " + formatDouble(root1) + ", " + formatDouble(root2) + "\n");
                        } else {
                            writer.write("Корней нет, значение дискриминанта меньше нуля: " +
                                    formatDouble(discriminant) + "\n");
                        }
                    } catch (Exception e) {
                        writer.write("Невозможно найти решение квадратного уравнения\n");
                    }
                    taskNumber++;
                }
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл " + path + " не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
        }
    }

    private static double evaluateExpression(String expression, char[] operators) throws Exception {
        String[] parts = expression.split(" ");
        double[] numbers = new double[parts.length];
        char lastOperator = '+';
        int index = 0;
        for (String part : parts) {
            if (isOperator(part, operators)) {
                lastOperator = part.charAt(0);
            } else {
                double number = parseNumber(part);
                switch (lastOperator) {
                    case '+':
                        numbers[index] = number;
                        break;
                    case '-':
                        numbers[index] = -number;
                        break;
                    case '*':
                        numbers[index - 1] *= number;
                        break;
                    case '/':
                        numbers[index - 1] /= number;
                        break;
                }
                index++;
            }
        }
        return Calculate.sum(numbers);
    }

    private static boolean isOperator(String str, char[] operators) {
        for (char operator : operators) {
            if (str.length() == 1 && str.charAt(0) == operator) {
                return true;
            }
        }
        return false;
    }

    private static double parseNumber(String str) throws Exception {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            throw new Exception("Ошибка валидации входных параметров");
        }
    }

    private static double calculateDiscriminant(double a) {
        Discriminant discriminant = (b, c, d) -> (b * b) - (4 * c * d);
        return discriminant.calculate(a, -20, 25);
    }

    private static String formatDouble(double number) {
        return String.format("%.3f", number);
    }
}

public class Main {
    public static void main(String[] args) {
        Parser.parse("src/resource/tasks.txt");
    }
}