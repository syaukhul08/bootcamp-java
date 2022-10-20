package com.aronsoft.database.repository;

import com.aronsoft.database.entity.RuangEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuangRepository extends JpaRepository<RuangEntity, String> {
}
