package com.bootcampjava.oop.controller;

import com.bootcampjava.oop.model.Dosen;
import com.bootcampjava.oop.model.Kelas;
import com.bootcampjava.oop.model.Mahasiswa;
import com.bootcampjava.oop.model.MataKuliah;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KelasController {
    @GetMapping("/kelas")
    public ResponseEntity<Object> get(){
        List<Kelas> result = new ArrayList<>();

       Dosen dosen = new Dosen(1211, "Agus", "Pria", "S.kom", "D-1211");

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
        MataKuliah mataKuliah2 = new MataKuliah("MK-001", "Pemrograman Java", 3);
        Kelas kelas2 = new Kelas("K-001", mataKuliah2, dosen, "Rabu", "13.00 - 15.00", mahasiswaList);
        result.add(kelas2);

        return ResponseEntity.ok()
                .body(result);
    }

}
