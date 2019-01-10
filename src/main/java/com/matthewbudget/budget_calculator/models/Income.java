package com.matthewbudget.budget_calculator.models;

public class Income {

    private int pay;
    private int other;

    public Income(){}

    public Income(int pay, int other) {
        this.pay = pay;
        this.other = other;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }
}
