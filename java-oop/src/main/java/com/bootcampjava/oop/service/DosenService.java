package com.bootcampjava.oop.service;

import com.bootcampjava.oop.model.Dosen;

import java.util.List;

public interface DosenService {
    public List<Dosen> get();
    public Dosen getById();
}
