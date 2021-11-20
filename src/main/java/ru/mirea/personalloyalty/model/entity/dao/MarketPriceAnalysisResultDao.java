package ru.mirea.personalloyalty.model.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.personalloyalty.model.entity.MarketPriceAnalysisResultEntity;

@Repository
public interface MarketPriceAnalysisResultDao extends JpaRepository<MarketPriceAnalysisResultEntity, Long> {
}
