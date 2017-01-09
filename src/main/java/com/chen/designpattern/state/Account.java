package com.chen.designpattern.state;

/**
 * Created by Chen on 2017/1/9.
 */
public class Account {
    private String mName;
    private AccountState mState;

    private double mMoney;

    public Account(String name, double money) {
        mName = name;
        mMoney = money;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public AccountState getState() {
        return mState;
    }

    public void setState(AccountState state) {
        mState = state;
    }

    public void save(double money) {
        mState.save(money);
        mMoney = mMoney + money;
        mState.stateCheck();
    }

    public double get(double money) {
        mState.get(money);
        mMoney = mMoney - money;
        mState.stateCheck();
        return money;
    }
}
