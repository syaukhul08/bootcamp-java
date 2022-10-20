package com.aronsoft.database.repository;

import com.aronsoft.database.entity.JurusanEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JurusanRepository extends JpaRepository<JurusanEntity, String> {
}
