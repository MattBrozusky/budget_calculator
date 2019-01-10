package com.matthewbudget.budget_calculator.models;

public class Budget {

    private Income monthlyIncome;
    private Savings monthlySavings;
    private Expenses monthlyExpenses;

    public Budget(){}

    public Budget(Income income, Savings savings, Expenses expenses){
        this.monthlyIncome = income;
        this.monthlySavings = savings;
        this.monthlyExpenses = expenses;
    }

    public Income getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Income monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public Savings getMonthlySavings() {
        return monthlySavings;
    }

    public void setMonthlySavings(Savings monthlySavings) {
        this.monthlySavings = monthlySavings;
    }

    public Expenses getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(Expenses monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }
}
