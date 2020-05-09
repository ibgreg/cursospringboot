package com.ibgreg.cursospringboot.services;

import org.springframework.mail.SimpleMailMessage;

import com.ibgreg.cursospringboot.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
