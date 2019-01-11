package com.matthewbudget.budget_calculator.models;

import javax.persistence.*;

@Entity
public class Expenses {

    @OneToOne
    private Budget budget;

    @Column()
    private int food;
    @Column()
    private int clothing;
    @Column()
    private int household;
    @Column()
    private int transportation;
    @Column()
    private int health;
    @Column()
    private int studentLoans;
    @Column()
    private int personal;
    @Column()
    private int carInsurance;
    @Column()
    private int houseInsurance;
    @Column()
    private int other;
    @Id @GeneratedValue
    private long id;

    public Expenses(){}

    public Expenses(int food, int clothing, int household, int transportation, int health, int studentLoans, int personal, int carInsurance, int houseInsurance, int other, long id) {
        this.food = food;
        this.clothing = clothing;
        this.household = household;
        this.transportation = transportation;
        this.health = health;
        this.studentLoans = studentLoans;
        this.personal = personal;
        this.carInsurance = carInsurance;
        this.houseInsurance = houseInsurance;
        this.other = other;
        this.id = id;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getClothing() {
        return clothing;
    }

    public void setClothing(int clothing) {
        this.clothing = clothing;
    }

    public int getHousehold() {
        return household;
    }

    public void setHousehold(int household) {
        this.household = household;
    }

    public int getTransportation() {
        return transportation;
    }

    public void setTransportation(int transportation) {
        this.transportation = transportation;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStudentLoans() {
        return studentLoans;
    }

    public void setStudentLoans(int studentLoans) {
        this.studentLoans = studentLoans;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }

    public int getCarInsurance() {
        return carInsurance;
    }

    public void setCarInsurance(int carInsurance) {
        this.carInsurance = carInsurance;
    }

    public int getHouseInsurance() {
        return houseInsurance;
    }

    public void setHouseInsurance(int houseInsurance) {
        this.houseInsurance = houseInsurance;
    }

    public int getOther() {
        return other;
    }

    public void setOther(int other) {
        this.other = other;
    }
}
