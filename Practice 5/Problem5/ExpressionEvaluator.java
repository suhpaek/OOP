package Problem5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class ExpressionEvaluator {
    private static final String INPUT_FILE = "Practice 5/Problem5/expressions.txt";
    private static final String RESULTS_FILE = "Practice 5/Problem5/results.txt";
    private static final String LOG_FILE = "Practice 5/Problem5/log.txt";

    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE));
                PrintWriter resultsWriter = new PrintWriter(new FileWriter(RESULTS_FILE));
                PrintWriter logWriter = new PrintWriter(new FileWriter(LOG_FILE))
        ) {
            String expression;

            while ((expression = reader.readLine()) != null) {
                if (expression.trim().isEmpty()) {
                    continue;
                }

                try {
                    double result = evaluateExpression(expression);
                    resultsWriter.println(expression + " = " + result);
                } catch (NoSuchElementException | NumberFormatException | UnsupportedOperationException e) {
                    logWriter.println("Expression: " + expression);
                    logWriter.println("Error: " + e.getClass().getSimpleName() + " - " + e.getMessage());
                }
            }

            System.out.println("Processing complete. Check results.txt and log.txt.");
        } catch (IOException e) {
            System.out.println("Could not process the expressions file.");
        }
    }

    private static double evaluateExpression(String expression) {
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/^", true);

        String firstOperandToken = tokenizer.nextToken().trim();
        String operatorToken = tokenizer.nextToken().trim();
        String secondOperandToken = tokenizer.nextToken().trim();

        if (tokenizer.hasMoreTokens()) {
            throw new NumberFormatException("Too many parts in expression");
        }

        double firstOperand = Double.parseDouble(firstOperandToken);
        double secondOperand = Double.parseDouble(secondOperandToken);

        return switch (operatorToken) {
            case "+" -> firstOperand + secondOperand;
            case "-" -> firstOperand - secondOperand;
            case "*" -> firstOperand * secondOperand;
            case "/" -> firstOperand / secondOperand;
            default -> throw new UnsupportedOperationException("Unsupported operator: " + operatorToken);
        };
    }
}
