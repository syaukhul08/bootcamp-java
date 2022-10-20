package com.aronsoft.database.model;

import com.aronsoft.database.entity.RuangEntity;

public class RuangModel {
    private String id;
    private String code;
    private String name;
    private String gedungId;
    private Integer lantaiKe;

    public RuangModel() {
    }

    public RuangModel(RuangEntity data) {
        this.id = data.getId();
        this.code = data.getCode();
        this.name = data.getName();
        this.gedungId = data.getGedungId();
        this.lantaiKe = data.getLantaiKe();
    }

    public RuangModel(String id, String code, String name, String gedungId, Integer lantaiKe) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.gedungId = gedungId;
        this.lantaiKe = lantaiKe;
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

    public String getGedungId() {
        return gedungId;
    }

    public void setGedungId(String gedungId) {
        this.gedungId = gedungId;
    }

    public Integer getLantaiKe() {
        return lantaiKe;
    }

    public void setLantaiKe(Integer lantaiKe) {
        this.lantaiKe = lantaiKe;
    }
}
