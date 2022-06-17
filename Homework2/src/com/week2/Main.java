package com.week2;

import com.week2.exception.PaymentException;
import com.week2.model.Bill;
import com.week2.model.BillType;
import com.week2.model.MemberAccount;
import com.week2.model.Response;
import com.week2.service.BillService;
import com.week2.service.BillServiceImp;

import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bill bill = new Bill();
        bill.setId(1L);
        bill.setAmount(50);
        bill.setProcessDate(new Date());
        bill.setBillType(BillType.Phone);

        Bill bill2 = new Bill();
        bill2.setId(2L);
        bill2.setAmount(60);
        bill2.setProcessDate(new Date());
        bill2.setBillType(BillType.WaterBill);

        MemberAccount memberAccount = new MemberAccount();
        memberAccount.setId(1L);
        memberAccount.setFirstName("Nazım");
        memberAccount.setLastName("Marul");
        memberAccount.setBalance(100);
        memberAccount.setPhoneNumber("1234567890");
        memberAccount.setBills(List.of(bill, bill2));

        bill.setMemberAccount(memberAccount);
        bill2.setMemberAccount(memberAccount);

        BillService billService = new BillServiceImp();
        Response response = new Response();

        try {
            response = billService.payment(bill, memberAccount);
        } catch (PaymentException e) {
            response.setCode("1");
            response.setDate(new Date().toString());
        }

        if (response.getCode().equals("0")) {
            System.out.println("İşlem Başarılı. İşlem Tarihi : " + response.getDate());
        } else
            System.out.println("İşlem Başarısız. İşlem Tarihi :" + response.getDate());

    }
}