package com.codewithmosh;

public class Report {
    MortgageCalculator calculator;
    public Report(MortgageCalculator calculator){
        this.calculator = calculator;
    }
    public void ReportingMortgage(){
        double mortgage = calculator.CalculatingMortgage();
        System.out.println("Mortgage: "+mortgage);
    }
    public void ReportingSchedule() {
        while (calculator.paidMonth != calculator.requiredPayMonth + 1) {
            calculator.CalculatingPaymentSchedule();
            System.out.println(calculator.remainingLoad);

        }
    }
}
