package com.aronsoft.database.service;

import com.aronsoft.database.entity.GedungEntity;
import com.aronsoft.database.model.GedungModel;
import com.aronsoft.database.repository.GedungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GedungServiceImpl implements GedungService{

    private GedungRepository repository;

    @Autowired
    public GedungServiceImpl(GedungRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<GedungModel> getAll(){
        List<GedungEntity> result = this.repository.findAll();
        if (result.isEmpty()){
            Collections.emptyList();
        }
        return result.stream().map(GedungModel::new).collect(Collectors.toList());
    }

    @Override
    public GedungModel getById(String id){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new GedungModel();
        }
        Optional<GedungEntity> result = repository.findById(id);
        return result.map(GedungModel::new).orElseGet(GedungModel::new);
    }

    @Override
    public GedungModel save(GedungModel data){
        if (data == null){
            return new GedungModel();
        }
        GedungEntity result = new GedungEntity(data);
        try {
            this.repository.save(result);
            return new GedungModel(result);
        }catch (Exception e){
            return new GedungModel();
        }
    }

    @Override
    public GedungModel update(String id, GedungModel data){
        if (id == null || id.isBlank()|| id.isEmpty()){
            return new GedungModel();
        }

        Optional<GedungEntity> result = repository.findById(id);

        if (result.isPresent()){
            GedungEntity gedungData = result.get();
            gedungData.setCode(data.getCode());
            gedungData.setName(data.getName());
            gedungData.setJmlLantai(data.getJlmLantai());
            gedungData.setUpdatedAt(LocalDateTime.now());
            gedungData.setUpdatetBy("SYSTEM");

            try {
                this.repository.save(gedungData);
                return new GedungModel(gedungData);
            }catch (Exception e){
                System.out.println("Error Update: "+e.getMessage());
            }
        }
        return new GedungModel();
    }

    @Override
    public GedungModel delete(String id){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new GedungModel();
        }

        Optional<GedungEntity> result = repository.findById(id);
        if (result.isPresent()){
            try {
                GedungEntity gedungData = result.get();
                this.repository.delete(gedungData);
                return new GedungModel(gedungData);
            }catch (Exception e){
                System.out.println("Error Delete: "+e.getMessage());
            }
        }
        return new GedungModel();
    }
}


