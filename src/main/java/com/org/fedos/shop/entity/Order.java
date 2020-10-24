package com.org.fedos.shop.entity;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")

public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String goodsId;

    @Column
    private Date date;

    @Column
    private Integer clientId;

    @Column
    private Boolean delivery;

}