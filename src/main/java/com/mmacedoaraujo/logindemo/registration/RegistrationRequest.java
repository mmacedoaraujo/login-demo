package com.mmacedoaraujo.logindemo.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    private final String firstName;
    private final String lastName;
    private final String passwordName;
    private final String email;
}
