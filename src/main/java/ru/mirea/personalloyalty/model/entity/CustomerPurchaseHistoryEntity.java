package ru.mirea.personalloyalty.model.entity;

import lombok.*;
import ru.mirea.personalloyalty.model.domain.Purchase;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customer_purchase_history")
public class CustomerPurchaseHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "purchase_date")
    private Date purchaseDate;
    @OneToMany(mappedBy = "customerPurchaseHistoryEntity", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<PurchaseEntity> purchaseEntityList;

    @ManyToOne
    @JoinColumn(name = "fk_customer_id", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomerEntity customerEntity;
}
