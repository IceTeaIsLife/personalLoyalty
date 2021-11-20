package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.CustomerPurchaseHistory;
import ru.mirea.personalloyalty.model.dto.CustomerPurchaseHistoryDto;
import ru.mirea.personalloyalty.model.entity.CustomerPurchaseHistoryEntity;

@Mapper(uses = PurchaseMapper.class)
public interface CustomerPurchaseHistoryMapper {
    CustomerPurchaseHistoryMapper CUSTOMER_PURCHASE_HISTORY_MAPPER = Mappers.getMapper(CustomerPurchaseHistoryMapper.class);

    @Mapping(target = "purchaseEntityList", source = "purchaseList")
    CustomerPurchaseHistoryEntity domainToEntity(CustomerPurchaseHistory customerPurchaseHistory);

    @Mapping(target = "purchaseList", source = "purchaseEntityList")
    CustomerPurchaseHistory entityToDomain(CustomerPurchaseHistoryEntity customerPurchaseHistoryEntity);

    @Mapping(target = "purchaseDtoList", source = "purchaseList")
    CustomerPurchaseHistoryDto domainToDto(CustomerPurchaseHistory customerPurchaseHistory);

    @Mapping(target = "purchaseList", source = "purchaseDtoList")
    CustomerPurchaseHistory dtoToDomain(CustomerPurchaseHistoryDto customerPurchaseHistoryDto);
}
