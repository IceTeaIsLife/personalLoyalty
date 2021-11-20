package ru.mirea.personalloyalty.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "market_price_analysis_result", schema = "public")
public class MarketPriceAnalysisResultEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "fk_client_product_id", referencedColumnName = "id")
    private ClientProductEntity clientProductEntity;
    @OneToOne
    @JoinColumn(name = "fk_product_category_id", referencedColumnName = "id")
    private ProductCategoryEntity productCategoryEntity;
    @Column(name = "product_median_price")
    private float productMedianPrice;
}
