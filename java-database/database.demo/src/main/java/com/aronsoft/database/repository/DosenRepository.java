package com.aronsoft.database.repository;

import com.aronsoft.database.entity.DosenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DosenRepository extends JpaRepository<DosenEntity, String> {
}
