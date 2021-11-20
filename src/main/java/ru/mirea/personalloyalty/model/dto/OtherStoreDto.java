package ru.mirea.personalloyalty.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherStoreDto {
    private Long id;
    private String name;
    private List<OtherStoreProductDto> otherStoreProductDtoList;
    private List<ProductCategoryDto> productCategoryDtoList;
}
