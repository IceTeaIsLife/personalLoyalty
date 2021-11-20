package ru.mirea.personalloyalty.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientProduct {
    private Long id;
    private int code;
    private String name;
    private float price;
}
