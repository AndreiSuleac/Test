package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            for (; ; ) {
                Scanner scanner = new Scanner(System.in);
                String readLine = scanner.nextLine();
                String[] array = readLine.split(" ");
                Calculator calculate = new Calculator();
                ExaminerValid val;

                if (array.length != 3)
                    throw new BorderException();

                val = new ExaminerValid(array);
                val.validExpression();

                calculate.result(val.romanValid(), val.getC(),
                        val.getNum1(), val.getNum2());
            }
        } catch (BorderException | OperandException | FormatException | RomanException e) {
            System.err.println(e);
        }
    }
}
