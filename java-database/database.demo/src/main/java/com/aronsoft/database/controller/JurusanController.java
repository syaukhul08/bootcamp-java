package com.aronsoft.database.controller;

import com.aronsoft.database.model.JurusanModel;
import com.aronsoft.database.service.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jurusan")
public class JurusanController {

    private JurusanService service;

    @Autowired
    public JurusanController(JurusanService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> getAll(){
        List<JurusanModel> result = service.getAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") String id){
        JurusanModel result = service.getById(id);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody JurusanModel request){
        JurusanModel result = service.save(request);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") String id, @RequestBody JurusanModel request){
        JurusanModel result = service.update(id,request);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id){
        JurusanModel result = service.delete(id);
        return ResponseEntity.ok().body(result);
    }

}
