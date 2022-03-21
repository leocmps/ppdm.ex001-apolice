package com.example.ex001apolice;

public class Apolice {
    private String name;
    private int age;
    private char sex;
    private double carValue;

    public Apolice () {}

    public Apolice (String name, int age, char sex, double carValue) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.carValue = carValue;
    }

    public double calculateVale () {
        if (this.sex == 'M' && this.age <= 25) return this.carValue * 10 / 100;
        if (this.sex == 'M' && this.age > 25) return  this.carValue * 5 / 100;
        if (this.sex == 'F') return this.carValue * 2 / 100;
        return this.carValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getCarValue() {
        return carValue;
    }

    public void setCarValue(double carValue) {
        this.carValue = carValue;
    }
}
