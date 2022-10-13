package com.bootcampjava.oop.model;

import java.util.List;

public class Kelas {
    private String kode;
    private MataKuliah matakuliah;
    private Dosen dosen;
    private String hari;
    private String jadwal;
    private List<Mahasiswa> mahasiswa;

    public Kelas() {
    }

    public Kelas(String kode, MataKuliah matakuliah, Dosen dosen, String hari, String jadwal, List<Mahasiswa> mahasiswa) {
        this.kode = kode;
        this.matakuliah = matakuliah;
        this.dosen = dosen;
        this.hari = hari;
        this.jadwal = jadwal;
        this.mahasiswa = mahasiswa;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public MataKuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public List<Mahasiswa> getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(List<Mahasiswa> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}

