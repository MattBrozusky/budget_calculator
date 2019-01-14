package com.matthewbudget.budget_calculator.models;

import javax.persistence.*;

@Entity
public class Savings {

    @OneToOne @JoinColumn (name = "budget_id")
    private Budget budget;

    @Column()
    private int emergencyFund;
    @Column()
    private int investments;
    @Column()
    private int retirement;
    @Column()
    private int surplus;
    @Id @GeneratedValue
    private long id;

    public Savings(){}

    public Savings(int emergencyFund, int investments, int retirement, int surplus, long id) {
        this.emergencyFund = emergencyFund;
        this.investments = investments;
        this.retirement = retirement;
        this.surplus = surplus;
        this.id = id;
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

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }
}
