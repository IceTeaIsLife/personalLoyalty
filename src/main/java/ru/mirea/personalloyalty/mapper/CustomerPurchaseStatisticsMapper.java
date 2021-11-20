package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.CustomerPurchaseStatistics;
import ru.mirea.personalloyalty.model.dto.CustomerPurchaseStatisticsDto;
import ru.mirea.personalloyalty.model.entity.CustomerPurchaseStatisticsEntity;

@Mapper
public interface CustomerPurchaseStatisticsMapper {
    CustomerPurchaseStatisticsMapper CUSTOMER_PURCHASE_STATISTICS_MAPPER = Mappers.getMapper(CustomerPurchaseStatisticsMapper.class);

    CustomerPurchaseStatisticsEntity domainToEntity(CustomerPurchaseStatistics customerPurchaseStatistics);

    CustomerPurchaseStatistics entityToDomain(CustomerPurchaseStatisticsEntity customerPurchaseStatisticsEntity);

    CustomerPurchaseStatisticsDto domainToDto(CustomerPurchaseStatistics customerPurchaseStatistics);

    CustomerPurchaseStatistics dtoToDomain(CustomerPurchaseStatisticsDto customerPurchaseStatisticsDto);
}
