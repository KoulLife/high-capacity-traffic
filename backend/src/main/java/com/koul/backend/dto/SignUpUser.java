package com.koul.backend.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignUpUser {
    String username;
    String password;
    String email;
}
