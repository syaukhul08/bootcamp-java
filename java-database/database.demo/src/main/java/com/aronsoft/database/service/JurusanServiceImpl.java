package com.aronsoft.database.service;

import com.aronsoft.database.entity.JurusanEntity;
import com.aronsoft.database.model.JurusanModel;
import com.aronsoft.database.repository.JurusanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JurusanServiceImpl implements JurusanService{

    private JurusanRepository repository;

    @Autowired
    public JurusanServiceImpl(JurusanRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<JurusanModel> getAll(){
        List<JurusanEntity> result = this.repository.findAll();
        if (result.isEmpty()){
            Collections.emptyList();
        }
        return result.stream().map(JurusanModel::new).collect(Collectors.toList());
    }

    @Override
    public JurusanModel getById(String id){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new JurusanModel();
        }
        Optional<JurusanEntity> result = repository.findById(id);
        return result.map(JurusanModel::new).orElseGet(JurusanModel::new);
    }

    @Override
    public JurusanModel save(JurusanModel data){
        if (data == null){
            return new JurusanModel();
        }
        JurusanEntity result = new JurusanEntity(data);
        try {
            this.repository.save(result);
            return new JurusanModel(result);
        }catch (Exception e){
            return new JurusanModel();
        }
    }

    @Override
    public JurusanModel update(String id, JurusanModel data){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new JurusanModel();
        }

        Optional<JurusanEntity> result = repository.findById(id);

        if (result.isPresent()){
            JurusanEntity jurusanData = result.get();
            jurusanData.setCode(data.getCode());
            jurusanData.setName(data.getName());
            jurusanData.setFakultasId(data.getFakultasId());
            jurusanData.setUpdatedAt(LocalDateTime.now());
            jurusanData.setUpdatedBy("SYSTEM");

            try {
                this.repository.save(jurusanData);
                return new JurusanModel(jurusanData);
            }catch (Exception e){
                System.out.println("Error Update: "+e.getMessage());
            }
        }
        return new JurusanModel();
    }

    @Override
    public JurusanModel delete(String id){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new JurusanModel();
        }

        Optional<JurusanEntity> result = repository.findById(id);
        if (result.isPresent()){
            try {
                JurusanEntity jurusanData = result.get();
                this.repository.delete(jurusanData);
                return new JurusanModel(jurusanData);
            }catch (Exception e){
                System.out.println("Error Delete: "+e.getMessage());
            }
        }
        return new JurusanModel();
    }
}
