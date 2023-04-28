package com.kshrd.oauth2.model;

import lombok.Data;

@Data
public class User {

    private Long id;

    private String name;

    private String email;

    private String password;


}