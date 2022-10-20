package com.aronsoft.database.service;

import com.aronsoft.database.entity.MataKuliahEntity;
import com.aronsoft.database.model.MataKuliahModel;
import com.aronsoft.database.repository.MataKuliahRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MataKuliahServiceImpl implements MataKuliahService{

    private MataKuliahRepository repository;

    @Autowired
    public MataKuliahServiceImpl(MataKuliahRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<MataKuliahModel> getAll(){
        List<MataKuliahEntity> result = this.repository.findAll();
        if (result.isEmpty()){
            Collections.emptyList();
        }
        return result.stream().map(MataKuliahModel::new).collect(Collectors.toList());
    }

    @Override
    public MataKuliahModel getById(String id){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new MataKuliahModel();
        }

        Optional<MataKuliahEntity> result = repository.findById(id);
        return result.map(MataKuliahModel::new).orElseGet(MataKuliahModel::new);
    }

    @Override
    public MataKuliahModel save(MataKuliahModel data){
        if (data == null){
            return new MataKuliahModel();
        }
        MataKuliahEntity result = new MataKuliahEntity(data);
        try {
            this.repository.save(result);
            return new MataKuliahModel(result);
        }catch (Exception e){
            return new MataKuliahModel();
        }
    }

    @Override
    public MataKuliahModel update(String id, MataKuliahModel data){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new MataKuliahModel();
        }

        Optional<MataKuliahEntity> result = repository.findById(id);

        if (result.isPresent()){
            MataKuliahEntity matkulData = result.get();
            matkulData.setCode(data.getCode());
            matkulData.setName(data.getName());
            matkulData.setSks(data.getSks());
            matkulData.setUpdatedAt(LocalDateTime.now());
            matkulData.setUpdatedBy("SYSTEM");

            try {
                this.repository.save(matkulData);
                return new MataKuliahModel(matkulData);
            }catch (Exception e){
                System.out.println("Error Update: "+e.getMessage());
            }
        }
        return new MataKuliahModel();
    }

    @Override
    public MataKuliahModel delete(String id){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new MataKuliahModel();
        }
        Optional<MataKuliahEntity> result = repository.findById(id);
        if (result.isPresent()){
            try {
                MataKuliahEntity matkuLdata = result.get();
                this.repository.delete(matkuLdata);
                return new MataKuliahModel(matkuLdata);
            }catch (Exception e){
                System.out.println("Error Delete: "+e.getMessage());
            }
        }
        return new MataKuliahModel();
    }
}
