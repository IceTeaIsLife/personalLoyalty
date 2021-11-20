package ru.mirea.personalloyalty.model.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.personalloyalty.model.entity.CustomerPurchaseHistoryEntity;

@Repository
public interface CustomerPurchaseHistoryDao extends JpaRepository<CustomerPurchaseHistoryEntity, Long> {
}
