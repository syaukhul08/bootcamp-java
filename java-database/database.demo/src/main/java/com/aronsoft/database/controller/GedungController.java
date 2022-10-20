package com.aronsoft.database.controller;

import com.aronsoft.database.model.GedungModel;
import com.aronsoft.database.service.GedungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gedung")
public class GedungController {

    private GedungService service;

    @Autowired
    public GedungController(GedungService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Object> getAll(){
        List<GedungModel> result = service.getAll();
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable("id") String id){
        GedungModel result = service.getById(id);
        return ResponseEntity.ok().body(result);
    }

    @PostMapping("")
    public ResponseEntity<Object> save(@RequestBody GedungModel request){
        GedungModel result = service.save(request);
        return ResponseEntity.ok().body(result);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable("id") String id, @RequestBody GedungModel request){
        GedungModel result = service.update(id, request);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id){
        GedungModel result = service.delete(id);
        return ResponseEntity.ok().body(result);
    }
}
