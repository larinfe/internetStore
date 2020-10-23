package com.org.fedos.shop.entity;
import javax.persistence.*;

@Entity
@Table(name = "cart_item")

public class Cart_item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cart_id;

    @Column
    private Integer goods_id;

    @Column
    private Integer amount;

}