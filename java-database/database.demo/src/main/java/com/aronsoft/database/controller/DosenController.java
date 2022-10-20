package com.aronsoft.database.controller;

import com.aronsoft.database.model.DosenModel;
import com.aronsoft.database.service.DosenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dosen")
public class DosenController {
    private DosenService service;

    @Autowired
    public DosenController(DosenService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> getAll(){
        List<DosenModel> result = service.getAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") String id){
        DosenModel result = service.getById(id);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody DosenModel request){
        DosenModel result = service.save(request);
        return ResponseEntity.ok().body(result);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") String id, @RequestBody DosenModel request){
        DosenModel result = service.update(id, request);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping
    public ResponseEntity<Object> delete(@PathVariable("id") String id){
        DosenModel result = service.delete(id);
        return ResponseEntity.ok().body(result);
    }


}
