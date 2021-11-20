package ru.mirea.personalloyalty.model.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.personalloyalty.model.entity.OtherStoreProductEntity;

@Repository
public interface OtherStoreProductDao extends JpaRepository<OtherStoreProductEntity, Long> {
}
