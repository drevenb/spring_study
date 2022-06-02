package com.spring_study.hibernate_one_to_one.entity;

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

    @OneToOne(mappedBy = "empDetail",
                cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Employee employee;

    public Detail(String city, String phone, String email) {
        this.city = city;
        this.phone = phone;
        this.email = email;
    }
}
