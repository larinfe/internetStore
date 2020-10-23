package com.org.fedos.shop.entity;
import javax.persistence.*;

@Entity
@Table(name = "roles")

public class Roles {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name_role;


}