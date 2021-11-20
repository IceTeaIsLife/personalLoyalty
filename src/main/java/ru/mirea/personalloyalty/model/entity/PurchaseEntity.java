package ru.mirea.personalloyalty.model.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "purchase_entity", schema = "public")
public class PurchaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "product_code")
    private int productCode;
    @Column(name = "discount")
    private float discount;
    @Column(name = "count")
    private int count;

    @ManyToOne
    @JoinColumn(name = "fk_customer_purchase_history_id", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomerPurchaseHistoryEntity customerPurchaseHistoryEntity;
}
