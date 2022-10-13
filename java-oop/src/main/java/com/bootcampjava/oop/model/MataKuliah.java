package com.bootcampjava.oop.model;

public class MataKuliah {
    private String kode;
    private String nama;
    private Integer sks;

    public MataKuliah() {
    }

    public MataKuliah(String kode, String nama, Integer sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }
}
