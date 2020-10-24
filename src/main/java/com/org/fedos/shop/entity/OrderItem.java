package com.org.fedos.shop.entity;
import javax.persistence.*;

@Entity
@Table(name = "order_item")

public class OrderItem {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @Column
    private Integer goodsId;

    @Column
    private Integer amount;

}