package com.org.fedos.shop.entity;
import javax.persistence.*;

@Entity
@Table(name = "cart_item")

public class CartItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;

    @Column
    private Integer goodsId;

    @Column
    private Integer amount;

}