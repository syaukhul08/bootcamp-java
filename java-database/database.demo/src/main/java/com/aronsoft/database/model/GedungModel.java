package com.aronsoft.database.model;

import com.aronsoft.database.entity.GedungEntity;

public class GedungModel {
    private String id;
    private String code;
    private String name;
    private Integer jlmLantai;

    public GedungModel() {
    }

    public GedungModel(GedungEntity data) {
        this.id = data.getId();
        this.code = data.getCode();
        this.name = data.getName();
        this.jlmLantai = data.getJmlLantai();
    }

    public GedungModel(String id, String code, String name, Integer jlmLantai) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.jlmLantai = jlmLantai;
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

    public Integer getJlmLantai() {
        return jlmLantai;
    }

    public void setJlmLantai(Integer jlmLantai) {
        this.jlmLantai = jlmLantai;
    }
}
