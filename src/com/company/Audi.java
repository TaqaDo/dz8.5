package com.company;

public class Audi extends Car {
    private int power;
    private String marka;


    public Audi( String marka ,int power ,double speed, double value, COLORS colors) {
        super(speed, value, colors );
        this.power = power;
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public int getPower() {
        return power;

    }

    public final void technic (int power, String marka ){
        System.out.println(" техника " + getPower() + " марка " + getMarka() );

    }
    public void technic ( String marka ) {
        System.out.println(" техника " + getPower() + " марка " + getMarka());
    }
    public void technic ( int power ) {
        System.out.println(" мощность " + getPower() + " марка " + getMarka());
    }
    @Override
    public String getInfo () {
        return " марка " + getMarka() + " мощность " + getPower() + " скороасть " + getSpeed()
                + " обьем " + getValue() + " цвет " + getColors() + super.getInfo();
    }

}
