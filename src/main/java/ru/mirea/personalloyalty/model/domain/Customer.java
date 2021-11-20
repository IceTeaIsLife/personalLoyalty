package ru.mirea.personalloyalty.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long id;
    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    private List<CustomerPurchaseHistory> customerPurchaseHistoryList;
    private List<CustomerPurchaseStatistics> customerPurchaseStatisticsList;
    private List<PersonalOffer> personalOfferList;
}
