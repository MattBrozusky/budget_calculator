package com.matthewbudget.budget_calculator.models;

public class Budget {

    private int totalYearlyIncome;
    private int totalYearlySavings;
    private int totalYearlyExpenses;

    public Budget(int totalYearlyIncome, int totalYearlySavings, int totalYearlyExpenses){
        this.totalYearlyIncome = totalYearlyIncome;
        this.totalYearlySavings = totalYearlySavings;
        this.totalYearlyExpenses = totalYearlyExpenses;
    }

    public int getTotalYearlyIncome() {
        return totalYearlyIncome;
    }

    public void setTotalYearlyIncome(int totalYearlyIncome) {
        this.totalYearlyIncome = totalYearlyIncome;
    }

    public int getTotalYearlySavings() {
        return totalYearlySavings;
    }

    public void setTotalYearlySavings(int totalYearlySavings) {
        this.totalYearlySavings = totalYearlySavings;
    }

    public int getTotalYearlyExpenses() {
        return totalYearlyExpenses;
    }

    public void setTotalYearlyExpenses(int totalYearlyExpenses) {
        this.totalYearlyExpenses = totalYearlyExpenses;
    }

    //monthly savings
    //monthly expenses
    //annual expenses

}
