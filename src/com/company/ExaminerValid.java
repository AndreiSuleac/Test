package com.company;

public class ExaminerValid {
    private String[] arabic = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private String[] roman = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private String[] operand = {"+", "-", "*", "/"};
    private String a, b, c;
    private int num1 = 0, num2 = 0;

    public ExaminerValid(String[] array) {
        a = array[0];
        b = array[2];
        c = array[1];
    }

    public boolean arabicValid() {
        int x = 0, y = 0;
        for (int i = 0; i < arabic.length; i++) {
            if (a.equals(arabic[i]))
                x = i + 1;
            if (b.equals(arabic[i]))
                y = i + 1;
        }
        if (x == 0 || y == 0)
            return false;
        num1 = x;
        num2 = y;
        return true;
    }

    public boolean romanValid() {
        int x = 0, y = 0;
        for (int i = 0; i < roman.length; i++) {
            if (a.equals(roman[i]))
                x = i + 1;
            if (b.equals(roman[i]))
                y = i + 1;
        }
        if (x == 0 || y == 0)
            return false;
        num1 = x;
        num2 = y;
        return true;
    }

    public boolean operandValid() {
        for (String op : operand) {
            if (c.equals(op))
                return true;
        }
        return false;
    }

    public void validExpression() throws OperandException , FormatException {
        if (operandValid() && (arabicValid() || romanValid()))
            return;
        else if (!operandValid())
            throw new OperandException();
        else
            throw new FormatException();
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getC() {
        return c;
    }
}
