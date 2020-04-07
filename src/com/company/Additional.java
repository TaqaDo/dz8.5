package com.company;

public class Additional {
    Additional price;
    Additional market;

    public Additional(Additional price, Additional sell) {
        this.price = price;
        this.market = sell;
    }

    public Additional(String sell, String avito) {
    }

    public Additional getPrice() {
        return price;
    }

    public Additional getMarket() {
        return market;
    }
}
