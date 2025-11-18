package com.example.testeunitario.service;

import org.springframework.stereotype.Service;

import com.example.testeunitario.util.EmailService;

@Service
public class NotificacaoService {

    private final EmailService emailService;

    public NotificacaoService(EmailService emailService ){
        this.emailService = emailService;
    }

    public void notificarUsuario(String email) {

        emailService.enviar(email, "Bem-vindo!", "Obrigado por se cadastrar em nosso sistema.");
    }

}
