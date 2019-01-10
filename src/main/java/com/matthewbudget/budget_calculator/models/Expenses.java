package com.matthewbudget.budget_calculator.models;

public class Expenses {

    private int food;
    private int clothing;
    private int shelter;
    private int household;
    private int transportation;
    private int health;
    private int studentLoans;
    private int personal;
    private int carInsurance;
    private int houseInsurance;
    private int other;

    public Expenses(){}

    public Expenses(int food, int clothing, int shelter, int household, int transportation, int health, int studentLoans, int personal, int carInsurance, int houseInsurance, int other) {
        this.food = food;
        this.clothing = clothing;
        this.shelter = shelter;
        this.household = household;
        this.transportation = transportation;
        this.health = health;
        this.studentLoans = studentLoans;
        this.personal = personal;
        this.carInsurance = carInsurance;
        this.houseInsurance = houseInsurance;
        this.other = other;
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

    public int getShelter() {
        return shelter;
    }

    public void setShelter(int shelter) {
        this.shelter = shelter;
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
