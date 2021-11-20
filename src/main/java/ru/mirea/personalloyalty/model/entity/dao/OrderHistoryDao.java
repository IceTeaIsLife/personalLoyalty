package ru.mirea.personalloyalty.model.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.personalloyalty.model.entity.OrderHistoryEntity;

@Repository
public interface OrderHistoryDao extends JpaRepository<OrderHistoryEntity, Long> {
    OrderHistoryEntity findOrderHistoryEntityByClientEntity_Name(String name);
}
