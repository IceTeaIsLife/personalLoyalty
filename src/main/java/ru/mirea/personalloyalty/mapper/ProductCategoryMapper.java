package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.ProductCategory;
import ru.mirea.personalloyalty.model.dto.ProductCategoryDto;
import ru.mirea.personalloyalty.model.entity.ProductCategoryEntity;

@Mapper(uses = OtherStoreMapper.class)
public interface ProductCategoryMapper {
    ProductCategoryMapper PRODUCT_CATEGORY_MAPPER = Mappers.getMapper(ProductCategoryMapper.class);

    @Mapping(target = "otherStoreEntityList", source = "otherStoreList")
    ProductCategoryEntity domainToEntity(ProductCategory productCategory);

    @Mapping(target = "otherStoreList", source = "otherStoreEntityList")
    ProductCategory entityToDomain(ProductCategoryEntity productCategoryEntity);

    @Mapping(target = "otherStoreDtoList", source = "otherStoreList")
    ProductCategoryDto domainToDto(ProductCategory productCategory);

    @Mapping(target = "otherStoreList", source = "otherStoreDtoList")
    ProductCategory dtoToDomain(ProductCategoryDto productCategoryDto);
}
