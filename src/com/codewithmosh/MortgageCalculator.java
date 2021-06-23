package com.codewithmosh;

import java.util.Scanner;

public class MortgageCalculator {
    public float percentageRate;
    public int requiredPayMonth;
    public int principle;
    public double element;
    public int paidMonth;
    public MortgageCalculator(int principle, float rate, int year) {
        this.percentageRate = rate / 100 / 12;

        this.requiredPayMonth = year * 12;
        this.principle = principle;
        this.element = Math.pow(1 + this.percentageRate, this.requiredPayMonth);
        this.paidMonth = 0;
    }
    public void FindingMortgage(){
        double mortgage = this.principle * this.element * this.percentageRate / (this.element - 1);
        System.out.println("Mortgage: " + mortgage);
    }
    public double ReadNumber(int min, int max, double value){
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextDouble();
        while (value<min | value>max) {
            System.out.println("Enter a number between " + min + " and " + max + ".");
            value = scanner.nextDouble();
        }
        return value;
    }
    public void PaymentSchedule(){
        double paid = Math.pow(1 + this.percentageRate, this.paidMonth++);
        double remainingLoad = this.principle*(this.element-paid)/(this.element-1);
        System.out.println(remainingLoad);
        while (this.paidMonth!=this.requiredPayMonth +1){
            PaymentSchedule();
        }
    }
}