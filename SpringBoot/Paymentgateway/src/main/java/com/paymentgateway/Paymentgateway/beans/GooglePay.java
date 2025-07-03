package com.paymentgateway.Paymentgateway.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class GooglePay implements  Payment {
   public  GooglePay()
    {
        System.out.println("googlePay constructor");
    }
    @Override
    public void payment(String ammount) {
        System.out.println("GooglePay payment done"+ammount);
    }
}
