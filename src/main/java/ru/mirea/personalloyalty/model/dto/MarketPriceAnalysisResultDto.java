package ru.mirea.personalloyalty.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarketPriceAnalysisResultDto {
    private Long id;
    private ClientProductDto clientProductDto;
    private ProductCategoryDto productCategoryDto;
    private float productMedianPrice;
}
