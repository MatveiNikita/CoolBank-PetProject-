package com.coolBank.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User {

    private UUID id;

    private String name;

    private String surname;

    private int yearOfBirth;

    private int monthOfBirth;

    private int dayOfBirth;

    private HashMap<String, String> address;

    private List<Account> accounts;

    // private BusinessAccount businessAccount;

}
