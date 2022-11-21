package ru.skypro.homework.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;

}
