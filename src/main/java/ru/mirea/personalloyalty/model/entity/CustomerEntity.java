package ru.mirea.personalloyalty.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.mirea.personalloyalty.model.domain.CustomerPurchaseHistory;
import ru.mirea.personalloyalty.model.domain.CustomerPurchaseStatistics;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customer", schema = "public")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email_address")
    private String emailAddress;

    @OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CustomerPurchaseHistoryEntity> customerPurchaseHistoryEntityList;

    @OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CustomerPurchaseStatisticsEntity> customerPurchaseStatisticsEntityList;

    @OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PersonalOfferEntity> personalOfferEntityList;

    @ManyToOne
    @JoinColumn(name = "fk_client_id", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ClientEntity clientEntity;
}
