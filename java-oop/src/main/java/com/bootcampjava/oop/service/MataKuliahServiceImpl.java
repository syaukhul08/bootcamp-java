package com.bootcampjava.oop.service;

import com.bootcampjava.oop.model.Dosen;
import com.bootcampjava.oop.model.MataKuliah;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class MataKuliahServiceImpl implements MataKuliahService{

    public List<MataKuliah> get() {

        List<MataKuliah> mataKuliahList = Arrays.asList(
                new MataKuliah("MK-001", "Pemrograman Java", 3),
                new MataKuliah("MK-002", "Pemrograman Database", 3),
                new MataKuliah("MK-003", "Networking", 3),
                new MataKuliah("MK-004", "Data Analyst", 3),
                new MataKuliah("MK-005", "Cloud Computing", 3)
        );
        return mataKuliahList;
    }
    @Override
    public MataKuliah getById(){
        return null;
    }
}
