package ru.mirea.personalloyalty.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherStore {
    private Long id;
    private String name;
    private List<OtherStoreProduct> otherStoreProductList;
    private List<ProductCategory> productCategoryList;
}
