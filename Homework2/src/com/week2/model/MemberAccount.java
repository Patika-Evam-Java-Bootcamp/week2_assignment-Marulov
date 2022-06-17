package com.week2.model;

import java.util.List;

// MemberAccount class'ını isterlere göre oluşturduk.
public class MemberAccount {

    private Long id;

    private String firstName;

    private String lastName;

    private String memberCode;

    private float balance;

    private String phoneNumber;

    private List<Bill> bills;

    public MemberAccount() {
    }

    public MemberAccount(Long id, String firstName, String lastName, String memberCode, float balance, String phoneNumber, List<Bill> bills) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberCode = id + memberCode.substring(0,2);
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.bills = bills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMemberCode() {
        return memberCode;
    }

    // id+ismin ilk 2 harfinden oluşan bir memberCode bilgisini oluşturduk
    public void setMemberCode(String memberCode) {
        this.memberCode = id + firstName.substring(0,2);
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }
}