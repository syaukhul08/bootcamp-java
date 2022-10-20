package com.aronsoft.database.controller;

import com.aronsoft.database.model.FakultasModel;
import com.aronsoft.database.service.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fakultas")
public class FakultasController {

    private FakultasService service;

    @Autowired
    public FakultasController(FakultasService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> getAll(){
        List<FakultasModel> result = service.getAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") String id){
        FakultasModel result = service.getById(id);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody FakultasModel request){
        FakultasModel result = service.save(request);
        return ResponseEntity.ok().body(result);
    }

    @PatchMapping ("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") String id, @RequestBody FakultasModel request){
        FakultasModel result = service.update(id, request);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delet(@PathVariable("id") String id){
        FakultasModel result = service.delete(id);
        return ResponseEntity.ok().body(result);
    }
}
