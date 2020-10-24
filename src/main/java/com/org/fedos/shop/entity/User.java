package com.org.fedos.shop.entity;
import javax.persistence.*;

@Entity
@Table(name = "users")

public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String address;

    @Column
    private String password;

    @Column
    private String email;

}