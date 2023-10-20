package com.abhi.foodcart.inventory.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "PRODUCT_PRICE")
public class ProductPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "ID")
    private long id;

    @Column(name = "COST_PRICE")
    private double costPrice;

    @Column(name = "SELLING_PRICE")
    private double sellingPrice;

    @Column(name = "STATUS")
    private int status;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CRTN_DATE", updatable = false)
    @Setter(AccessLevel.NONE)
    private Date crtnDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPD_DATE", updatable = false)
    @Setter(AccessLevel.NONE)
    private Date lastUpdDate;
}
