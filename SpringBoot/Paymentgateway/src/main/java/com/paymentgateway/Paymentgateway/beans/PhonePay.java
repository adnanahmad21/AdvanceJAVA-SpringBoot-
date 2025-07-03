package com.paymentgateway.Paymentgateway.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class PhonePay implements  Payment{

    public PhonePay()
    {
        System.out.println("PhonePay contructor");
    }
    @Override
    public void payment(String ammount) {
        System.out.println("PhonePay payment done"+ammount);
    }
}
