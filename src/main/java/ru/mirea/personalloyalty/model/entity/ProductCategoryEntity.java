package ru.mirea.personalloyalty.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.mirea.personalloyalty.model.domain.OtherStore;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "product_category")
public class ProductCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "productCategoryEntityList")
    private List<OtherStoreEntity> otherStoreEntityList;

    @OneToOne(mappedBy = "productCategoryEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private MarketPriceAnalysisResultEntity marketPriceAnalysisResultEntity;
}
