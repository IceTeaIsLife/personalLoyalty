package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.OtherStoreProduct;
import ru.mirea.personalloyalty.model.dto.OtherStoreProductDto;
import ru.mirea.personalloyalty.model.entity.OtherStoreProductEntity;

@Mapper
public interface OtherStoreProductMapper {
    OtherStoreProductMapper OTHER_STORE_PRODUCT_MAPPER = Mappers.getMapper(OtherStoreProductMapper.class);

    OtherStoreProductEntity domainToEntity(OtherStoreProduct otherStoreProduct);

    OtherStoreProduct entityToDomain(OtherStoreProductEntity otherStoreProductEntity);

    OtherStoreProductDto domainToDto(OtherStoreProduct otherStoreProduct);

    OtherStoreProduct dtoToDomain(OtherStoreProductDto otherStoreProductDto);
}
