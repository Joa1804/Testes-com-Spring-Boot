package com.example.testeunitario.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.testeunitario.util.EmailService;

public class NotificacaoServiceTest {
    @Test
    void testNotificarUsuario() {
       //Arrange
        EmailService mockEmail = Mockito.mock(EmailService.class);
        NotificacaoService notificacao = new NotificacaoService(mockEmail);

        //Act
        notificacao.notificarUsuario("ana@exemplo.com");

        //Assert
        Mockito.verify(mockEmail).enviar(
            Mockito.eq("ana@exemplo.com"),
            Mockito.eq("Bem-vindo!"),
            Mockito.anyString()
        );
    }
}
