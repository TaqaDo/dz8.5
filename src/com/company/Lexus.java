package com.company;

public final class Lexus extends Audi{
    private int year;
    private String model;
    Additional additional;


    public Lexus(Additional additional,int year, String model,String marka, int power, double speed, double value, COLORS colors) {
        super(marka, power, speed, value, colors);
        this.year = year;
        this.model = model;
        this.additional = additional;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public Additional getAdditional() {
        return additional;
    }
    @Override
    public void technic ( int power ) {
        System.out.println(" мощность " + getPower()) ;
    }

    @Override
    public String getInfo () {
        return " год " + getYear() + " модель " + getModel() + super.getInfo() ;
    }
}
