package com.org.fedos.shop.entity;
import javax.persistence.*;

@Entity
@Table(name = "order_item")

public class Order_item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id;

    @Column
    private Integer goods_id;

    @Column
    private Integer amount;

}