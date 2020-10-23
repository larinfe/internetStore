package com.org.fedos.shop.entity;
import javax.persistence.*;

@Entity
@Table(name = "cart")

public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer client_id;

    @Column
    private Integer total_price;

}