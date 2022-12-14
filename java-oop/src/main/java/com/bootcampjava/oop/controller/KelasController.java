package com.bootcampjava.oop.controller;

import com.bootcampjava.oop.model.*;
import com.bootcampjava.oop.service.KelasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class KelasController {

    //properti
    private KelasService kelasService;

    @Autowired
    public KelasController(KelasService kelasService){
        this.kelasService = kelasService;
    }

    @GetMapping("/kelas")
    public ResponseEntity<Object> get(){
        List<Kelas> result = kelasService.get();

        return ResponseEntity.ok()
                .body(result);
    }

}
