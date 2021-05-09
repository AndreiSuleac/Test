package com.company;

public class Calculator {
    TransformRoman romanTransform = new TransformRoman();

    public int calculate(String operand, int num1, int num2) {
        return switch (operand) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> num1 / num2;
        };
    }

    public void result(boolean romanValid, String operand,
                       int num1, int num2) throws RomanException {
        int a;
        String b;
        a = calculate(operand, num1, num2);
        if (romanValid) {
            if (a < 1)
                throw new RomanException();
            b = romanTransform.resultRom(a);
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
