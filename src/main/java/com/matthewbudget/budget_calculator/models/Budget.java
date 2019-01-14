package com.matthewbudget.budget_calculator.models;


import javax.persistence.*;

@Entity
public class Budget {

    @OneToOne @JoinColumn(name = "user_id")
    private User owner;
    @OneToOne(cascade = {CascadeType.ALL}, mappedBy = "budget")
    private Income monthlyIncome;
    @OneToOne(cascade = {CascadeType.ALL}, mappedBy = "budget")
    private Savings monthlySavings;
    @OneToOne(cascade = {CascadeType.ALL}, mappedBy = "budget")
    private Expenses monthlyExpenses;
    @Id @GeneratedValue
    private long id;

    public Budget(){}

//    public Budget(long id){
//        this.id = id;
//    }

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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
