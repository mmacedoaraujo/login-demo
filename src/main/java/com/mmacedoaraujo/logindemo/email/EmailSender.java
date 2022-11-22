package com.mmacedoaraujo.logindemo.email;

import org.springframework.context.annotation.Bean;

public interface EmailSender {
    void send(String to, String email);
}
