package com.example.emperortest;

public class Bill {

    int billId;
    Long amount;
    int homeId;
    Month month;

    public Bill() {
    }


    public Bill(int billId, Long amount,Month month, int homeId) {
        this.billId = billId;
        this.amount = amount;
        this.month = month;
        this.homeId = homeId;
    }

    public int getBillId() {
        return billId;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }
}
