package ru.mirea.personalloyalty.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "personal_offer", schema = "public")
public class PersonalOfferEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "product_code")
    private int productCode;
    @Column(name = "discount")
    private float discount;

    @ManyToOne
    @JoinColumn(name = "fk_customer_id", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private CustomerEntity customerEntity;
}
