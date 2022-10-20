package com.aronsoft.database.model;

import com.aronsoft.database.entity.JurusanEntity;

public class JurusanModel {
    private String id;
    private String code;
    private String name;
    private String fakultasId;

    public JurusanModel() {
    }

    public JurusanModel(JurusanEntity data) {
        this.id = data.getId();
        this.code = data.getCode();
        this.name = data.getName();
        this.fakultasId = data.getFakultasId();
    }

    public JurusanModel(String id, String code, String name, String fakultasId) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.fakultasId = fakultasId;
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

    public String getFakultasId() {
        return fakultasId;
    }

    public void setFakultasId(String fakultasId) {
        this.fakultasId = fakultasId;
    }
}
