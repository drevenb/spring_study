package com.spring_study.hibernate_test2.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name="detail")
@Data
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String city;

    @Column(name="phone_humber")
    private String phoneNumber;

    @Email
    private String email;

    public Detail(String city, String phoneNumber, String email) {
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
