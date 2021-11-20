package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.Customer;
import ru.mirea.personalloyalty.model.dto.CustomerDto;
import ru.mirea.personalloyalty.model.entity.CustomerEntity;

@Mapper(uses = {CustomerPurchaseHistoryMapper.class, CustomerPurchaseStatisticsMapper.class, PersonalOfferMapper.class})
public interface CustomerMapper {
    CustomerMapper CUSTOMER_MAPPER = Mappers.getMapper(CustomerMapper.class);

    @Mappings({
            @Mapping(target = "customerPurchaseHistoryEntityList", source = "customerPurchaseHistoryList"),
            @Mapping(target = "customerPurchaseStatisticsEntityList", source = "customerPurchaseStatisticsList"),
            @Mapping(target = "personalOfferEntityList", source = "personalOfferList")
    })
    CustomerEntity domainToEntity(Customer customer);

    @Mappings({
            @Mapping(target = "customerPurchaseHistoryList", source = "customerPurchaseHistoryEntityList"),
            @Mapping(target = "customerPurchaseStatisticsList", source = "customerPurchaseStatisticsEntityList"),
            @Mapping(target = "personalOfferList", source = "personalOfferEntityList")
    })
    Customer entityToDomain(CustomerEntity customerEntity);

    @Mappings({
            @Mapping(target = "customerPurchaseHistoryDtoList", source = "customerPurchaseHistoryList"),
            @Mapping(target = "customerPurchaseStatisticsDtoList", source = "customerPurchaseStatisticsList"),
            @Mapping(target = "personalOfferDtoList", source = "personalOfferList")
    })
    CustomerDto domainToDto(Customer customer);

    @Mappings({
            @Mapping(target = "customerPurchaseHistoryList", source = "customerPurchaseHistoryDtoList"),
            @Mapping(target = "customerPurchaseStatisticsList", source = "customerPurchaseStatisticsDtoList"),
            @Mapping(target = "personalOfferList", source = "personalOfferDtoList")
    })
    Customer dtoToDomain(CustomerDto customerDto);
}
