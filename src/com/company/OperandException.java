package com.company;

public class OperandException extends Throwable {
    @Override
    public String toString() {
        return "\n The operand not found, use the following signs as : +, -, *, /";
    }
}

class FormatException extends Throwable {
    @Override
    public String toString() {
        return "\n Error, both digits must be in Roman or Arabic from 1 to 10 (I - X)";
    }
}

class RomanException extends Throwable {
    @Override
    public String toString() {
        return "\n The result cannot be rendered with Roman numerals";
    }
}

class BorderException extends Throwable {
    @Override
    public String toString() {
        return "\n Enter 2 Roman or Arabic numerals (1-10,I-X) " +
                "and an operator (+, -, *, /) in the given format: num1 + num2";
    }
}
