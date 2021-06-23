package com.codewithmosh;
import java.util.Scanner;

public class ReadingValue {

    public double ReadNumber(int min, int max, double value) {
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextDouble();
        while (value < min | value > max) {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            value = scanner.nextDouble();
        }
        return value;
    }
}