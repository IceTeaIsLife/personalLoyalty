package ru.mirea.personalloyalty.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private Long id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private List<Customer> customerList;
    private List<ClientProduct> clientProductList;
}
