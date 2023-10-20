package com.abhi.foodcart.inventory.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "PRODUCT_TYPE")
public class ProductType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TYPE_ID")
    private long typeId;

    @Column(name = "TYPE", nullable = false, unique = true)
    private String type;

    @Column(name = "UUID", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private String uuid;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CRTN_DATE")
    @Setter(AccessLevel.NONE)
    private Date crtnDate;

    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "LAST_UPD_DATE")
    @Setter(AccessLevel.NONE)
    private Date lastUpdDate;

    @Column(name = "STATUS")
    private int status;
}
