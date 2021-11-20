package ru.mirea.personalloyalty.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import ru.mirea.personalloyalty.model.domain.PersonalOffer;
import ru.mirea.personalloyalty.model.dto.PersonalOfferDto;
import ru.mirea.personalloyalty.model.entity.PersonalOfferEntity;

@Mapper
public interface PersonalOfferMapper {
    PersonalOfferMapper PERSONAL_OFFER_MAPPER = Mappers.getMapper(PersonalOfferMapper.class);

    PersonalOfferEntity domainToEntity(PersonalOffer personalOffer);

    PersonalOffer entityToDomain(PersonalOfferEntity personalOfferEntity);

    PersonalOfferDto domainToDto(PersonalOffer personalOffer);

    PersonalOffer dtoToDomain(PersonalOfferDto personalOfferDto);
}
