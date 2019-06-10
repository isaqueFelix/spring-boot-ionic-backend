package br.com.isaquefelix.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.isaquefelix.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
}
