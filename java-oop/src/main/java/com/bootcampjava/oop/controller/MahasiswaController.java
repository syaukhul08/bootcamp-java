package com.bootcampjava.oop.controller;

import com.bootcampjava.oop.model.Kelas;
import com.bootcampjava.oop.model.Mahasiswa;
import com.bootcampjava.oop.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MahasiswaController {


    private MahasiswaService mahasiswaService;

    @Autowired
    public MahasiswaController(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }

    @GetMapping("/mahasiswa")
    public ResponseEntity<Object>get(){
        List<Mahasiswa> result = mahasiswaService.get();

        return ResponseEntity.ok()
                .body(result);
    }
}
