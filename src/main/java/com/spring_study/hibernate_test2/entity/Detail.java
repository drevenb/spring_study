package com.spring_study.hibernate_test2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Data
@Table(name="detail")
@NoArgsConstructor
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String city;

    @Column(name="phone_number")
    private String phone;

    @Column
    @Email
    private String email;

    public Detail(String city, String phone, String email) {
        this.city = city;
        this.phone = phone;
        this.email = email;
    }
}
