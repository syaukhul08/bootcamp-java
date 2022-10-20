package com.aronsoft.database.entity;

import com.aronsoft.database.model.JurusanModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "jurusan_tab")
public class JurusanEntity {

    @Id
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "kode_jurusan", length = 20, unique = true)
    private String code;

    @Column(name = "nama_jurusan", length = 225)
    private String name;

    @Column(name = "fakultas_id", length = 36)
    private String fakultasId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "update_at")
    private LocalDateTime updatedAt;

    @Column(name = "updated_by", length = 20)
    private String updatedBy;

    public String getId() {
        return id;
    }

    public JurusanEntity() {
    }

    public JurusanEntity(JurusanModel data) {
        this.id = UUID.randomUUID().toString();
        this.code = data.getCode();
        this.name = data.getName();
        this.fakultasId = data.getFakultasId();
        this.createdAt = LocalDateTime.now();
        this.createdBy = "SYSTEM";
        this.updatedAt = LocalDateTime.now();
        this.updatedBy = "SYSTEM";
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFakultasId() {
        return fakultasId;
    }

    public void setFakultasId(String fakultasId) {
        this.fakultasId = fakultasId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
