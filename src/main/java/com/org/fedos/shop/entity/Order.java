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
    private String goods_id;

    @Column
    private Date date;

    @Column
    private Integer client_id;

    @Column
    private Boolean delivery;

}