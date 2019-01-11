package com.matthewbudget.budget_calculator.models;

import javax.persistence.*;

@Entity
public class Budget {

    @OneToOne
    private Income monthlyIncome;
    @OneToOne
    private Savings monthlySavings;
    @OneToOne
    private Expenses monthlyExpenses;
    @Id @GeneratedValue
    private long id;

    public Budget(){}

    public Budget(Income income, Savings savings, Expenses expenses, long id){
        this.monthlyIncome = income;
        this.monthlySavings = savings;
        this.monthlyExpenses = expenses;
        this.id = id;
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

    public long getId() {
        return id;
    }
}
