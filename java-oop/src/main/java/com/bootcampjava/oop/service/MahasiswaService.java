package com.bootcampjava.oop.service;

import com.bootcampjava.oop.model.Mahasiswa;
import com.bootcampjava.oop.model.MataKuliah;

import java.util.List;

public interface MahasiswaService {
    public List<Mahasiswa> get();
    public Mahasiswa getById();

}
