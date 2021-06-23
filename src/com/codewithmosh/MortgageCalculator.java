package com.codewithmosh;

public class MortgageCalculator {
    public float percentageRate;
    public int requiredPayMonth;
    public int principle;
    public double element;
    public int paidMonth;
    public double mortgage;
    public double remainingLoad;
    public MortgageCalculator(int principle, float rate, int year) {
        this.percentageRate = rate / 100 / 12;
        this.requiredPayMonth = year * 12;
        this.principle = principle;
        this.element = Math.pow(1 + percentageRate, requiredPayMonth);
        this.paidMonth = 0;
        this.mortgage = 0;
    }
    public double CalculatingMortgage(){
        mortgage = principle * element * percentageRate / (element - 1);

        return mortgage;
    }

    public void CalculatingPaymentSchedule(){
        double paid = Math.pow(1 + percentageRate, paidMonth++);
        remainingLoad = principle*(element-paid)/(element-1);

        }
    }
