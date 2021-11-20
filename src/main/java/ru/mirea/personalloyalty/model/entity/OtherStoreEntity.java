package ru.mirea.personalloyalty.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "other_store", schema = "public")
public class OtherStoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "otherStoreEntity", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<OtherStoreProductEntity> otherStoreProductEntityList;

    @ManyToMany
    @JoinTable(
            name = "category_other_store",
            joinColumns = @JoinColumn(name = "other_store_id"),
            inverseJoinColumns = @JoinColumn(name = "product_category_id")
    )
    private List<ProductCategoryEntity> productCategoryEntityList;
}
