package com.codewithmosh;
public class Main {

    public static void main(String[] args) {
        var mortgage = new MortgageCalculator(0,0,0);
        System.out.println("Principle: ");
        int principle = (int)mortgage.ReadNumber(1000,1000000,-1);
        System.out.println("Annual Interest Rate: ");
        float rate = (float) mortgage.ReadNumber(0,30,-1);
        System.out.println("Year: ");
        int year = (int)mortgage.ReadNumber(0,30,-1);
        mortgage = new MortgageCalculator(principle, rate, year);
        mortgage.FindingMortgage();
        mortgage.PaymentSchedule();


    }




}
