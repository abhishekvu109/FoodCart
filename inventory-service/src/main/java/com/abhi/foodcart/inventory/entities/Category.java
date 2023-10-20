package com.abhi.foodcart.inventory.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Data
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCT_CATEGORY")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID")
    @Setter(AccessLevel.PRIVATE)
    private long categoryId;

    @Column(name = "UUID")
    @Setter(AccessLevel.NONE)
    private String uuid;

    @Column(name = "CATEGORY_NAME", unique = true)
    private String categoryName;

    @Column(name = "REF_ID", unique = true)
    private String refId;

    @OneToMany(mappedBy = "category")
    private List<ProductType> productTypeList;
    @Column(name = "CATEGORY_DEC")
    private String categoryDesc;

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

    @Column(name = "STATUS")
    private int status;
}
