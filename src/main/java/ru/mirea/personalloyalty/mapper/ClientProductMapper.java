package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.ClientProduct;
import ru.mirea.personalloyalty.model.dto.ClientProductDto;
import ru.mirea.personalloyalty.model.entity.ClientProductEntity;

@Mapper
public interface ClientProductMapper {
    ClientProductMapper CLIENT_PRODUCT_MAPPER = Mappers.getMapper(ClientProductMapper.class);

    ClientProductEntity domainToEntity(ClientProduct clientProduct);

    ClientProduct entityToDomain(ClientProductEntity clientProductEntity);

    ClientProductDto domainToDto(ClientProduct clientProduct);

    ClientProduct dtoToDomain(ClientProductDto clientProductDto);
}
