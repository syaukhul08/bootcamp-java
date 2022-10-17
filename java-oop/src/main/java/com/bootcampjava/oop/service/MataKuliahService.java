package com.bootcampjava.oop.service;

import com.bootcampjava.oop.model.MataKuliah;

import java.util.List;

public interface MataKuliahService {
    public List<MataKuliah> get();
    public MataKuliah getById();
}
