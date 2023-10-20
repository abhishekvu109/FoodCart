package com.abhi.foodcart.inventory.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "SUPPLIER")
public class Supplier implements Comparable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "SUPPLIER_ID")
    private long supplierId;

    @Column(name = "UUID", unique = true)
    private String uuid;

    @Column(name = "SUPPLIER_NAME", unique = true)
    private String supplierName;

    @OneToMany
    @JoinColumn(name = "CATEGORY_ID")
    private List<Category> categoryList;

    @OneToMany
    @JoinColumn(name = "ADDRESS_ID")
    private List<Address> addresses;

    @OneToMany
    @JoinColumn(name = "PRODUCT_TYPE")
    private List<ProductType> type;

    @CreationTimestamp
    @Setter(AccessLevel.NONE)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CRTN_DATE")
    private Date crtnDate;

    @UpdateTimestamp
    @Setter(AccessLevel.NONE)
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPD_DATE")
    private Date updDate;

    @Column(name = "STATUS")
    private int status;

    @Override
    public int compareTo(Object o) {
        if (o instanceof Supplier) {
            Supplier supplier = (Supplier) o;
            return supplier.getSupplierName().isEmpty() ? 0 : supplier.getSupplierName().compareTo(this.supplierName);
        }
        return 0;
    }
}
