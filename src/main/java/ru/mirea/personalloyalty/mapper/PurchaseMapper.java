package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.Purchase;
import ru.mirea.personalloyalty.model.dto.PurchaseDto;
import ru.mirea.personalloyalty.model.entity.PurchaseEntity;

@Mapper
public interface PurchaseMapper {
    PurchaseMapper PURCHASE_MAPPER = Mappers.getMapper(PurchaseMapper.class);

    PurchaseEntity domainToEntity(Purchase purchase);

    Purchase entityToDomain(PurchaseEntity purchaseEntity);

    PurchaseDto domainToDto(Purchase purchase);

    Purchase dtoToDomain(PurchaseDto purchaseDto);
}
