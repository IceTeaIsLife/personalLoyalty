package ru.mirea.personalloyalty.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerPurchaseStatistics {
    private Long id;
    private int productCode;
    private int totalCount;
}
