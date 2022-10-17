package com.bootcampjava.oop.service;

import com.bootcampjava.oop.model.Alamat;
import com.bootcampjava.oop.model.Mahasiswa;
import com.bootcampjava.oop.model.MataKuliah;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class MahasiswaServiceImpl implements MahasiswaService{

    public List<Mahasiswa> get(){

        List<Mahasiswa> mahasiswaList = Arrays.asList(
                new Mahasiswa(117,"Toni", "Bandung", LocalDate.of(2000, 2, 4), "Pria",
                        new Alamat(112, "Jl. Diponegoro No.22", "Citarum", "Bandung Wetan" , "Kota Bandung" , "Jawa Barat"),"TI-117", "TI", 2021),
                new Mahasiswa(118,"Rina", "Yogyakarta", LocalDate.of(2001, 6, 15), "Wanita",
                        new Alamat(110,"Jalan Laksda Adisucipto", "Caturtunggal", "Depok", "Sleman", "DIY"),"TI-118", "TI",2021),
                new Mahasiswa(119,"Yogi", "Semarang", LocalDate.of(2000, 11, 23), "Pria",
                        new Alamat(111, "Jalan Pemuda", "Sekayu", "Semarang Tengah", "Semarang", "Jawa Tengah"),"TI-119","TI",2021),
                new Mahasiswa(120,"Boby", "Jakarta", LocalDate.of(2000, 9, 11), "Pria",
                        new Alamat(112, "Jalan Metro Pondok Indah", "Pondok Pinang", "Kebayoran Lama", "Jakarta Selatan", "DKI Jakarta"),"TI-120", "TI",2021)

        );
        return mahasiswaList;

    }

    @Override
    public Mahasiswa getById(){
        return null;
    }
}
