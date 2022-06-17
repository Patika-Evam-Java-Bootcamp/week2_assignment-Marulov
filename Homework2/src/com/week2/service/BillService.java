package com.week2.service;

import com.week2.exception.PaymentException;
import com.week2.model.Bill;
import com.week2.model.BillType;
import com.week2.model.MemberAccount;
import com.week2.model.Response;

public interface BillService {

    Response successProcess();

    Response payment(Bill bill, MemberAccount memberAccount) throws PaymentException;

    Response cancelPayment(BillType billType);

    Response whichBill(BillType billType, String memberCode);

    Response whichBill(BillType billType, String phoneNumber, String memberCode);
}