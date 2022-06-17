package com.week2.model;

import java.util.Date;

// Bill class'ını isterlere göre oluşturduk.
public class Bill {

    private Long id;

    private int amount;

    private Date processDate;

    private BillType billType;

    private MemberAccount memberAccount; // faturanin sadece bir sahibi olabilir.

    public Bill() {
    }

    public Bill(Long id, int amount, Date processDate, BillType billType, MemberAccount memberAccount) {
        this.id = id;
        this.amount = amount;
        this.processDate = processDate;
        this.billType = billType;
        this.memberAccount = memberAccount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public BillType getBillType() {
        return billType;
    }

    public void setBillType(BillType billType) {
        this.billType = billType;
    }

    public MemberAccount getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(MemberAccount memberAccount) {
        this.memberAccount = memberAccount;
    }
}