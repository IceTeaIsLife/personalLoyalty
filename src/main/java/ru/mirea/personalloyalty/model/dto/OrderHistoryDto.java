package ru.mirea.personalloyalty.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderHistoryDto {
    private Long id;
    private Date startDate;
    private Date endDate;
    private ClientDto clientDto;
}
