package ru.mirea.personalloyalty.model.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.personalloyalty.model.entity.ClientProductEntity;

@Repository
public interface ClientProductDao extends JpaRepository<ClientProductEntity, Long> {
}
