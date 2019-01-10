package com.matthewbudget.budget_calculator.models;

public class Savings {

    private int emergencyFund;
    private int investments;
    private int retirement;
    private int surplus;

    public Savings(){}

    public Savings(int emergencyFund, int investments, int retirement, int surplus) {
        this.emergencyFund = emergencyFund;
        this.investments = investments;
        this.retirement = retirement;
        this.surplus = surplus;
    }

    public int getEmergencyFund() {
        return emergencyFund;
    }

    public void setEmergencyFund(int emergencyFund) {
        this.emergencyFund = emergencyFund;
    }

    public int getInvestments() {
        return investments;
    }

    public void setInvestments(int investments) {
        this.investments = investments;
    }

    public int getRetirement() {
        return retirement;
    }

    public void setRetirement(int retirement) {
        this.retirement = retirement;
    }

    public int getSurplus() {
        return surplus;
    }

    public void setSurplus(int surplus) {
        this.surplus = surplus;
    }
}
