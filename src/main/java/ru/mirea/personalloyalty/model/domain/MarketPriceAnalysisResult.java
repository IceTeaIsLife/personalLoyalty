package ru.mirea.personalloyalty.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarketPriceAnalysisResult {
    private Long id;
    private ClientProduct clientProduct;
    private ProductCategory productCategory;
    private float productMedianPrice;
}
