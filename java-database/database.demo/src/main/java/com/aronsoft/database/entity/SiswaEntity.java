package com.aronsoft.database.entity;

import com.aronsoft.database.model.SiswaModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "siswa_tab")
public class SiswaEntity {
    @Id
    @Column(name = "id", length = 36)
    private String id;

    @Column(name = "nama_siswa", length = 120)
    private String name;

    @Column(name = "jk", length = 10)
    private String jk;

    @Column(name = "alamat", length = 200)
    private String alamat;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime createdAt;

    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_at")
    private LocalDateTime updateAt;

    @Column(name = "updated_by", length = 20)
    private String updateBy;

    public SiswaEntity() {

    }

    public SiswaEntity(SiswaModel data){
        this.id = UUID.randomUUID().toString();
        this.name = data.getName();
        this.jk = data.getJk();
        this.alamat = data.getAlamat();
        this.createdAt = LocalDateTime.now();
        this.createdBy = "SYSTEM";
        this.updateAt = LocalDateTime.now();
        this.updateBy = "SYSTEM";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}
