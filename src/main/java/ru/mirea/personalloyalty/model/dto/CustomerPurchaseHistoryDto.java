package ru.mirea.personalloyalty.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerPurchaseHistoryDto {
    private Long id;
    private Date purchaseDate;
    private List<PurchaseDto> purchaseDtoList;
}
