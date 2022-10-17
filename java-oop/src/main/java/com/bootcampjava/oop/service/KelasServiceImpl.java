package com.bootcampjava.oop.service;

import com.bootcampjava.oop.model.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class KelasServiceImpl implements KelasService{
    @Override
    public List<Kelas> get(){
        List<Kelas> result = new ArrayList<>();

        Dosen dosen = new Dosen(1211, "Agus", "Solo", LocalDate.of(1965, 12, 14),"Pria",
                new Alamat(101, "Jalan Kamandungan", "Baluwarti", "Pasar Kliwon", "Kota Surakarta", "Jawa Tengah"),"S.kom", "D-1211");

        List<Mahasiswa> mahasiswaList = Arrays.asList(
                new Mahasiswa(111, "Budi", "Pria", "TI-111", "TI", 2022),
                new Mahasiswa(112, "Hani", "Wanita", "TI-112", "TI", 2022),
                new Mahasiswa(113, "Iwan", "Pria", "TI-113", "TI", 2022),
                new Mahasiswa(115, "Tika", "Wanita", "TI-114", "TI", 2022),
                new Mahasiswa(116, "Joko", "Pria", "TI-115", "TI", 2022)
        );

        //kelas 1
        MataKuliah mataKuliah = new MataKuliah("MK-001", "Pemrograman Java", 3);
        Kelas kelas1 = new Kelas("K-001", mataKuliah, dosen, "Senin", "10.00 - 12.00", mahasiswaList);
        result.add(kelas1);

        //kelas 2
        List<Mahasiswa> mahasiswaList2 = Arrays.asList(
                new Mahasiswa(117,"Toni", "Bandung", LocalDate.of(2000, 2, 4), "Pria", "TI-117", "TI", 2021),
                new Mahasiswa(118,"Rina", "Yogyakarta", LocalDate.of(2001, 6, 15), "Wanita",
                        new Alamat(110,"Jalan Laksda Adisucipto", "Caturtunggal", "Depok", "Sleman", "DIY"),"TI-118", "TI",2021),
                new Mahasiswa(119,"Yogi", "Semarang", LocalDate.of(2000, 11, 23), "Pria",
                        new Alamat(111, "Jalan Pemuda", "Sekayu", "Semarang Tengah", "Semarang", "Jawa Tengah"),"TI-119","TI",2021),
                new Mahasiswa(120,"Boby", "Jakarta", LocalDate.of(2000, 9, 11), "Pria",
                        new Alamat(112, "Jalan Metro Pondok Indah", "Pondok Pinang", "Kebayoran Lama", "Jakarta Selatan", "DKI Jakarta"),"TI-120", "TI",2021)

        );

        Dosen dosen2 = new Dosen(1212, "Hadi", "Yogyakarta", LocalDate.of(1960, 7, 24),"Pria",
                new Alamat(102, "Jalan Raya Janti", "Banguntapan", "Banguntapan", "Bantul"," DIY"),"S.kom", "D-1212");

        MataKuliah mataKuliah2 = new MataKuliah("MK-002", "Pemrograman Database", 3);
        Kelas kelas2 = new Kelas("K-002", mataKuliah2, dosen2, "Rabu", "13.00 - 15.00", mahasiswaList2);
        result.add(kelas2);

        return result;
    }
    @Override
    public Kelas getById(){
        return null;
    }
}
