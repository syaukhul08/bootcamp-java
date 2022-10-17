package com.bootcampjava.oop.service;

import com.bootcampjava.oop.model.Alamat;
import com.bootcampjava.oop.model.Dosen;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class DosenServiceImpl implements DosenService{

    public List<Dosen> get(){

        List<Dosen> dosenList = Arrays.asList(
                new Dosen(1211, "Agus", "Solo", LocalDate.of(1965, 12, 14),"Pria",
                        new Alamat(101, "Jalan Kamandungan", "Baluwarti", "Pasar Kliwon", "Kota Surakarta", "Jawa Tengah"),"S.kom", "D-1211"),
                new Dosen(1212, "Hadi", "Yogyakarta", LocalDate.of(1960, 7, 24),"Pria",
                        new Alamat(102, "Jalan Raya Janti", "Banguntapan", "Banguntapan", "Bantul"," DIY"),"S.kom", "D-1212")
        );

        return dosenList;
    }
    @Override
    public Dosen getById(){
        return null;
    }
}
