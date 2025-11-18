package com.example.testeunitario.util;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.testeunitario.service.NotificacaoService;

public class EmailTest {
    
    @Test
    void deveLancarErroParaEmailInvalido(){
        EmailService mockEmail = Mockito.mock(EmailService.class);
        NotificacaoService notificacao = new NotificacaoService(mockEmail);

        assertThrows(IllegalArgumentException.class, () -> {
            notificacao.notificarUsuario("");
        });
    }

}
