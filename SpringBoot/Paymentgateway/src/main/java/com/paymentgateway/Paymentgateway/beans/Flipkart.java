package com.paymentgateway.Paymentgateway.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class Flipkart {
 @Autowired
 @Qualifier("googlePay")

    public Payment pay;
    public void dopayment(String money)
    {
        System.out.println(" Welcome to flipkart payment methods");
        pay.payment(money);
    }
}
