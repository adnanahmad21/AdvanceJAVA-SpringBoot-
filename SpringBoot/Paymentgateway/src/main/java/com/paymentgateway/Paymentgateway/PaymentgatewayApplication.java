package com.paymentgateway.Paymentgateway;

import com.paymentgateway.Paymentgateway.beans.Flipkart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PaymentgatewayApplication {

	public static void main(String[] args) {


		ApplicationContext context=SpringApplication.run(PaymentgatewayApplication.class, args);
		Flipkart payment=context.getBean(Flipkart.class);
		payment.dopayment("100000");
	}

}
