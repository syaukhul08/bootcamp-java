package com.aronsoft.database.model;

import com.aronsoft.database.entity.FakultasEntity;

public class FakultasModel {
    private String id;
    private String code;
    private String name;
    private String alamat;

    public FakultasModel() {
    }

    public FakultasModel(FakultasEntity data){
        this.id = data.getId();
        this.code = data.getCode();
        this.name = data.getName();
        this.alamat = data.getAlamat();
    }

    public FakultasModel(String id, String code, String name, String alamat) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.alamat = alamat;
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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
