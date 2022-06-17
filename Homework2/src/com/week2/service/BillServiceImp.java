package com.week2.service;

import com.week2.exception.PaymentException;
import com.week2.model.Bill;
import com.week2.model.BillType;
import com.week2.model.MemberAccount;
import com.week2.model.Response;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.week2.model.BillType.*;

public class BillServiceImp implements BillService {

    public Response successProcess() {
        Date now = new Date();
        DateFormat stringNow = new SimpleDateFormat("yyyy/MM/dd");
        return new Response("0", stringNow.format(now));
    }

    public Response payment(Bill bill, MemberAccount memberAccount) throws PaymentException {
        if (memberAccount.getBalance() < bill.getAmount()) {
            throw new PaymentException("Insufficient Balance");
        }
        return successProcess();
    }

    public Response cancelPayment(BillType billType) {
        return successProcess();
    }

    public Response whichBill(BillType billType, String memberCode) {
        cancelPayment(billType);
        return successProcess();
    }

    public Response whichBill(BillType billType, String phoneNumber, String memberCode) {
        checkBillType(billType);
        return successProcess();
    }

    private void checkBillType(BillType billType) {
        if (billType == Phone)
            System.out.println("Telephone bill.");
        else if (billType == Internet)
            System.out.println("Internet bill.");
        else if (billType == WaterBill)
            System.out.println("Water bill.");
        else
            System.out.println("There is no such bill type");
    }
}