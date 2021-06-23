package com.codewithmosh;
public class Main {

    public static void main(String[] args) {
        var readValue = new ReadingValue();
        System.out.println("Principle: ");
        int principle = (int)readValue.ReadNumber(1000,1000000,-1);
        System.out.println("Annual Interest Rate: ");
        float rate = (float) readValue.ReadNumber(0,30,-1);
        System.out.println("Year: ");
        int year = (int)readValue.ReadNumber(0,30,-1);
        var mortgage = new MortgageCalculator(principle, rate, year);
        var reading = new Report(mortgage);
        reading.ReportingMortgage();
        reading.ReportingSchedule();


    }




}
