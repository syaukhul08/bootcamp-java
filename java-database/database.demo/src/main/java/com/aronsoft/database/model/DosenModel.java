package com.aronsoft.database.model;

import com.aronsoft.database.entity.DosenEntity;

public class DosenModel {
    private String id;
    private String nip;
    private String name;
    private String jk;
    private String alamat;
    private String gelar;

    public DosenModel() {
    }

    public DosenModel(DosenEntity data){
        this.id = data.getId();
        this.name = data.getName();
        this.jk = data.getJk();
        this.alamat = data.getAlamat();
        this.gelar = data.getGelar();
    }

    public DosenModel(String id, String nip, String name, String jk, String alamat, String gelar) {
        this.id = id;
        this.nip = nip;
        this.name = name;
        this.jk = jk;
        this.alamat = alamat;
        this.gelar = gelar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }
}
