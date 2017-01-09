package com.chen.designpattern.state;

/**
 * Created by Chen on 2017/1/9.
 */
public abstract class AccountState {
    private Account mAccount;

    public Account getAccount() {
        return mAccount;
    }

    public void setAccount(Account account) {
        mAccount = account;
    }

    public abstract double get(double money);

    public abstract void save(double money);

    public abstract void stateCheck();
}
