package com.org.fedos.shop.entity;
import javax.persistence.*;

@Entity
@Table(name = "goods")

public class Goods {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private Number price;

    @Column
    private String img;

}