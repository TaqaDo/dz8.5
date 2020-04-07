package com.company;

public class Car {
    private double speed;
    private double value;
    private COLORS colors;


    public Car(double speed, double value, COLORS colors) {
        this.speed = speed;
        this.value = value;
        this.colors = colors;
    }

    public double getSpeed() {
        return speed;
    }

    public double getValue() {
        return value;
    }

    public COLORS getColors() {
        return colors;
    }
    public String getInfo (){
        return " Скорость " + getSpeed() + " обьем машины " + getValue() + " цвет машины " + getColors() ;
    }
}
