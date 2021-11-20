package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.MarketPriceAnalysisResult;
import ru.mirea.personalloyalty.model.dto.MarketPriceAnalysisResultDto;
import ru.mirea.personalloyalty.model.entity.MarketPriceAnalysisResultEntity;

@Mapper(uses = {ClientProductMapper.class, ProductCategoryMapper.class})
public interface MarketPriceAnalysisResultMapper {
    MarketPriceAnalysisResultMapper MARKET_PRICE_ANALYSIS_RESULT_MAPPER = Mappers.getMapper(MarketPriceAnalysisResultMapper.class);

    @Mappings({
            @Mapping(target = "clientProductEntity", source = "clientProduct"),
            @Mapping(target = "productCategoryEntity", source = "productCategory")
    })
    MarketPriceAnalysisResultEntity domainToEntity(MarketPriceAnalysisResult marketPriceAnalysisResult);

    @Mappings({
            @Mapping(target = "clientProduct", source = "clientProductEntity"),
            @Mapping(target = "productCategory", source = "productCategoryEntity")
    })
    MarketPriceAnalysisResult entityToDomain(MarketPriceAnalysisResultEntity marketPriceAnalysisResultEntity);

    @Mappings({
            @Mapping(target = "clientProductDto", source = "clientProduct"),
            @Mapping(target = "productCategoryDto", source = "productCategory")
    })
    MarketPriceAnalysisResultDto domainToDto(MarketPriceAnalysisResult marketPriceAnalysisResult);

    @Mappings({
            @Mapping(target = "clientProduct", source = "clientProductDto"),
            @Mapping(target = "productCategory", source = "productCategoryDto")
    })
    MarketPriceAnalysisResult dtoToDomain(MarketPriceAnalysisResultDto marketPriceAnalysisResultDto);
}
