package ru.mirea.personalloyalty.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
    private Long id;
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private List<CustomerDto> customerDtoList;
    private List<ClientProductDto> clientProductDtoList;
}
