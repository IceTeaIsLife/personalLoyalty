package ru.mirea.personalloyalty.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherStoreProductDto {
    private Long id;
    private int code;
    private float price;
    private float discount;
}
