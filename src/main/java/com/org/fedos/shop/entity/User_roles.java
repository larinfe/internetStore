package com.org.fedos.shop.entity;
import javax.persistence.*;

@Entity
@Table(name = "user_roles")

public class User_roles {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    @Column
    private Integer role_id;


}