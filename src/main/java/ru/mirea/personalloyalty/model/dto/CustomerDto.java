package ru.mirea.personalloyalty.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {
    private Long id;
    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private List<CustomerPurchaseHistoryDto> customerPurchaseHistoryDtoList;
    private List<CustomerPurchaseStatisticsDto> customerPurchaseStatisticsDtoList;
    private List<PersonalOfferDto> personalOfferDtoList;
}
