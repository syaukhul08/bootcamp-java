package com.bootcampjava.oop.model;

public class Mahasiswa extends Orang {
    private String nim;
    private String jurusan;
    private Integer ta;

    public Mahasiswa() {
    }

    public Mahasiswa(int nik, String nama, String jk, String nim, String jurusan, Integer ta) {
        super(nik, nama, jk);
        this.nim = nim;
        this.jurusan = jurusan;
        this.ta = ta;
    }

    public Mahasiswa(String nim, String jurusan, Integer ta) {
        super();
        this.nim = nim;
        this.jurusan = jurusan;
        this.ta = ta;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public Integer getTa() {
        return ta;
    }

    public void setTa(Integer ta) {
        this.ta = ta;
    }
}
