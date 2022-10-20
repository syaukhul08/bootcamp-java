package com.aronsoft.database.model;

import com.aronsoft.database.entity.MataKuliahEntity;

public class MataKuliahModel {
    private String id;
    private String code;
    private String name;
    private Integer sks;

    public MataKuliahModel() {
    }

    public MataKuliahModel(MataKuliahEntity data) {
        this.id = data.getId();
        this.code = data.getCode();
        this.name = data.getName();
        this.sks = data.getSks();
    }

    public MataKuliahModel(String id, String code, String name, Integer sks) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.sks = sks;
    }

    public String getId() {
        return id;
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

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }
}
