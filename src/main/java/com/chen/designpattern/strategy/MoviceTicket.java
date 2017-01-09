package com.chen.designpattern.strategy;

/**
 * Created by Chen on 2017/1/9.
 */
public class MoviceTicket {

    private double mPrice;
    private Discount mDiscount;

    public double getPrice() {
        return mDiscount.discount(mPrice);
    }

    public void setPrice(double price) {
        mPrice = price;
    }

    public Discount getDiscount() {
        return mDiscount;
    }

    public void setDiscount(Discount discount) {
        mDiscount = discount;
    }
}
