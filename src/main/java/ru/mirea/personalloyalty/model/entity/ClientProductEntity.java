package ru.mirea.personalloyalty.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "client_product", schema = "public")
public class ClientProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "code")
    private int code;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private float price;

    @ManyToOne
    @JoinColumn(name = "fk_client_id", nullable = false)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ClientEntity clientEntity;

    @OneToOne(mappedBy = "clientProductEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private MarketPriceAnalysisResultEntity marketPriceAnalysisResultEntity;
}
