package com.bootcampjava.oop.controller;

import com.bootcampjava.oop.model.MataKuliah;
import com.bootcampjava.oop.service.MataKuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MataKuliahController {

    private MataKuliahService mataKuliahService;

    @Autowired
    public MataKuliahController(MataKuliahService mataKuliahService) {
        this.mataKuliahService = mataKuliahService;
    }

    @GetMapping("/matkul")
    public ResponseEntity<Object> get(){
        List<MataKuliah> result = mataKuliahService.get();
        return ResponseEntity.ok()
                .body(result);
    }
}
