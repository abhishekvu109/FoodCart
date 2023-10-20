package com.abhi.foodcart.inventory.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID")
    @Setter(AccessLevel.NONE)
    private long productId;

    @Column(name = "uuid", unique = true, nullable = false)
    private String uuid;


    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @Column(name = "PRODUCT_DESC")
    private String productDescription;

    @ManyToOne
    @JoinColumn(name = "CATEGORY")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_TYPE")
    private ProductType productType;

    @Column(name = "STATUS")
    private String status;

    @OneToMany(mappedBy = "product")
    private List<ProductPrice> priceList;

    @Column(name = "COUNTRY_OF_ORIGIN")
    private String countryOfOrigin;

    @CreationTimestamp
    @Column(name = "CRTN_DATE", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Setter(AccessLevel.NONE)
    private Date crtnDate;

    @UpdateTimestamp
    @Column(name = "UPD_DATE", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Setter(AccessLevel.NONE)
    private Date updDate;

    @Column(name="EXPIRY_DATE",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
}
