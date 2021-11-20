package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.OtherStore;
import ru.mirea.personalloyalty.model.dto.OtherStoreDto;
import ru.mirea.personalloyalty.model.entity.OtherStoreEntity;

@Mapper(uses = {OtherStoreProductMapper.class, ProductCategoryMapper.class})
public interface OtherStoreMapper {
    OtherStoreMapper OTHER_STORE_MAPPER = Mappers.getMapper(OtherStoreMapper.class);

    @Mappings({
            @Mapping(target = "otherStoreProductEntityList", source = "otherStoreProductList"),
            @Mapping(target = "productCategoryEntityList", source = "productCategoryList")
    })
    OtherStoreEntity domainToEntity(OtherStore otherStore);

    @Mappings({
            @Mapping(target = "otherStoreProductList", source = "otherStoreProductEntityList"),
            @Mapping(target = "productCategoryList", source = "productCategoryEntityList")
    })
    OtherStore entityToDomain(OtherStoreEntity otherStoreEntity);

    @Mappings({
            @Mapping(target = "otherStoreProductDtoList", source = "otherStoreProductList"),
            @Mapping(target = "productCategoryDtoList", source = "productCategoryList")
    })
    OtherStoreDto domainToDto(OtherStore otherStore);

    @Mappings({
            @Mapping(target = "otherStoreProductList", source = "otherStoreProductDtoList"),
            @Mapping(target = "productCategoryList", source = "productCategoryDtoList")
    })
    OtherStore dtoToDomain(OtherStoreDto otherStoreDto);
}
