package ru.mirea.personalloyalty.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "other_store_product")
public class OtherStoreProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "code")
    private int code;
    @Column(name = "price")
    private float price;
    @Column(name = "discount")
    private float discount;

    @ManyToOne
    @JoinColumn(name = "fk_other_store_id", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private OtherStoreEntity otherStoreEntity;
}
