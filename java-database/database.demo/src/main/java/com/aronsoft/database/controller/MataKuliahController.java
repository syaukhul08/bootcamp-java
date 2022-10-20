package com.aronsoft.database.controller;

import com.aronsoft.database.model.MataKuliahModel;
import com.aronsoft.database.service.MataKuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matkul")
public class MataKuliahController {

    private MataKuliahService service;

    @Autowired
    public MataKuliahController(MataKuliahService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> getAll(){
        List<MataKuliahModel> result = service.getAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") String id){
        MataKuliahModel result = service.getById(id);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody MataKuliahModel request){
        MataKuliahModel result = service.save(request);
        return ResponseEntity.ok().body(result);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") String id, @RequestBody MataKuliahModel request){
        MataKuliahModel result = service.update(id,request);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id){
        MataKuliahModel result = service.delete(id);
        return ResponseEntity.ok().body(result);
    }
}
