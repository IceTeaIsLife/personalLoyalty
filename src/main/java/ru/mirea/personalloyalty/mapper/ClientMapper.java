package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.Client;
import ru.mirea.personalloyalty.model.dto.ClientDto;
import ru.mirea.personalloyalty.model.entity.ClientEntity;

@Mapper(uses = {CustomerMapper.class, ClientProductMapper.class})
public interface ClientMapper {
    ClientMapper CLIENT_MAPPER = Mappers.getMapper(ClientMapper.class);

    @Mappings({
            @Mapping(target = "customerEntityList", source = "customerList"),
            @Mapping(target = "clientProductEntityList", source = "clientProductList")
    })
    ClientEntity domainToEntity(Client client);

    @Mappings({
            @Mapping(target = "customerList", source = "customerEntityList"),
            @Mapping(target = "clientProductList", source = "clientProductEntityList")
    })
    Client entityToDomain(ClientEntity clientEntity);

    @Mappings({
            @Mapping(target = "customerDtoList", source = "customerList"),
            @Mapping(target = "clientProductDtoList", source = "clientProductList")
    })
    ClientDto domainToDto(Client client);

    @Mappings({
            @Mapping(target = "customerList", source = "customerDtoList"),
            @Mapping(target = "clientProductList", source = "clientProductDtoList")
    })
    Client dtoToDomain(ClientDto clientDto);
}
