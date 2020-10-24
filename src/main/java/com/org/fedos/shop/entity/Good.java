package com.org.fedos.shop.entity;
import javax.persistence.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;

@Entity
@Table(name = "goods")

public class Good {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column
    private String category;

    @Column
    private BigDecimal price;

    @Column
    private String img;

}