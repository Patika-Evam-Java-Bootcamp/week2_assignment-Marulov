package com.week2.service;

import com.week2.model.MemberAccount;

public class MemberAccountService {

    // MemberAccount eklendi.
    public void create(MemberAccount memberAccount) {
        System.out.println(memberAccount.getMemberCode() + " kayıt eklendi");
    }

    // Bütün hesapları getirildi
    public void getAll() {
        System.out.println("Bütün hesapları getirildi");
    }

    // MemberAcount güncellendi
    public void update(MemberAccount memberAccount) {
        System.out.println(memberAccount.getMemberCode() + " kayıt güncellendi");
    }

    // seçili id li MemberAccount silindi.
    public void delete(int id) {
        System.out.println(id + " id numaralı kayıt silindi.");
    }
}