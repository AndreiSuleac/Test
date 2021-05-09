package com.company;

public class TransformRoman {
    public String resultRom(int x) {
        StringBuilder s = new StringBuilder();
        while (x >= 100) {
            x = x - 100;
            s.append("C");
        }
        while (x >= 90) {
            x = x - 90;
            s.append("XC");
        }
        while (x >= 50) {
            x = x - 50;
            s.append("L");
        }
        while (x >= 40) {
            x = x - 40;
            s.append("XL");
        }
        while (x >= 10) {
            x = x - 10;
            s.append("X");
        }
        if (x == 9) {
            s.append("IX");
            return s.toString();
        }
        while (x >= 5) {
            x = x - 5;
            s.append("V");
        }
        if (x == 4) {
            s.append("IV");
            return s.toString();
        }
        while (x < 4 && x > 0) {
            x--;
            s.append("I");
        }
        return s.toString();
    }
}
