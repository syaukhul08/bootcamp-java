package com.aronsoft.database.repository;

import com.aronsoft.database.entity.GedungEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GedungRepository extends JpaRepository<GedungEntity, String> {
}
