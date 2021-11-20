package ru.mirea.personalloyalty.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseDto {
    private Long id;
    private int productCode;
    private float discount;
    private int count;
}
