package com.example.emperortest;

public class BillDetails {

    Month month;
    Long totalAMount;

    public BillDetails() {
    }

    public BillDetails(Month month, Long totalAMount) {
        this.month = month;
        this.totalAMount = totalAMount;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public Long getTotalAMount() {
        return totalAMount;
    }

    public void setTotalAMount(Long totalAMount) {
        this.totalAMount = totalAMount;
    }
}
