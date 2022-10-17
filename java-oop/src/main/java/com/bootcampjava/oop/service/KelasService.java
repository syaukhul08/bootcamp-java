package com.bootcampjava.oop.service;

import com.bootcampjava.oop.model.Kelas;

import java.util.List;

public interface KelasService {
    public List<Kelas> get();
    public Kelas getById();
}
