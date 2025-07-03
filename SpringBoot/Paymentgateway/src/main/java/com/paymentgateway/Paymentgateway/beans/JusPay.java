package com.paymentgateway.Paymentgateway.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary agr qualifer ni lga h flipkart m toh agr lga h to iski valye ni h lgane ki koe
@Component
public class JusPay implements  Payment{
    public JusPay()
    {
        System.out.println("JusPay constructor");
    }
    @Override
    public void payment(String ammount) {
        System.out.println("JusPay payment  done"+ammount);
    }
}
