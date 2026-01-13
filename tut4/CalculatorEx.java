package tut4;

import java.util.Scanner;

public class CalculatorEx {
    private double result;

    public CalculatorEx() {
        result = 0;
    }

    public double resultValue() {
        return result;
    }

    public void doCalculation() throws UnknownOperatorException {
        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);
        if (op == 'q' || op == 'Q') {
            throw new UnknownOperatorException(op);
        }
        double val = sc.nextDouble();
        result = evaluate(op, result, val);
        System.out.println("result " + op + " " + val + " = " + result);
        System.out.println("updated result = " + result);
    }

    public double handleUnknownOpException() {
        System.out.println("Please reenter:");
        System.out.println("updated result = " + result);
        return result;
    }

    public double evaluate(char op, double n1, double n2) throws UnknownOperatorException {
        switch (op) {
            case '+': return n1 + n2;
            case '-': return n1 - n2;
            case '*': return n1 * n2;
            case '/': return n1 / n2;
            default: throw new UnknownOperatorException(op);
        }
    }

    public static void main(String[] args) {
        CalculatorEx c = new CalculatorEx();
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator is on");
        System.out.println("result = " + c.result);
        while (true) {
            try {
                c.doCalculation();
            } catch (UnknownOperatorException e) {
                if (e.getMessage().equals("q") || e.getMessage().equals("Q")) {
                    System.out.println("Final result = " + c.result);
                    break;
                } else {
                    System.out.println(e.getMessage() + " is an unknown operator");
                    c.handleUnknownOpException();
                }
            }
        }
        System.out.println("End of Program");
        sc.close();
    }
}
