package com.bootcampjava.oop.controller;

import com.bootcampjava.oop.model.Dosen;
import com.bootcampjava.oop.service.DosenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DosenController {

    private DosenService dosenService;

    @Autowired
    public DosenController(DosenService dosenService) {
        this.dosenService = dosenService;
    }

    @GetMapping("/dosen")
    public ResponseEntity<Object>get(){
        List<Dosen> result = dosenService.get();

        return ResponseEntity.ok()
                .body(result);
    }
}
