package com.matthewbudget.budget_calculator.models;

import javax.persistence.*;

@Entity
public class Income {

    @OneToOne
    private Budget budget;

    @Column()
    private int pay;
    @Column()
    private int other;
    @Id @GeneratedValue
    private long id;

    public Income(){}

    public Income(int pay, int other, long id) {
        this.pay = pay;
        this.other = other;
        this.id = id;
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
