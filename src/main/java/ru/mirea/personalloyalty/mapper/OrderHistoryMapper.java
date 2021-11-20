package ru.mirea.personalloyalty.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.OrderHistory;
import ru.mirea.personalloyalty.model.dto.OrderHistoryDto;
import ru.mirea.personalloyalty.model.entity.OrderHistoryEntity;

@Mapper(uses = ClientMapper.class)
public interface OrderHistoryMapper {
    OrderHistoryMapper ORDER_HISTORY_MAPPER = Mappers.getMapper(OrderHistoryMapper.class);

    @Mapping(target = "clientEntity", source = "client")
    OrderHistoryEntity domainToEntity(OrderHistory orderHistory);

    @Mapping(target = "client", source = "clientEntity")
    OrderHistory entityToDomain(OrderHistoryEntity orderHistoryEntity);

    @Mapping(target = "clientDto", source = "client")
    OrderHistoryDto domainToDto(OrderHistory orderHistory);

    @Mapping(target = "client", source = "clientDto")
    OrderHistory dtoToDomain(OrderHistoryDto orderHistoryDto);
}
