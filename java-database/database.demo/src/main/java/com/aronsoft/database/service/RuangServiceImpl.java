package com.aronsoft.database.service;

import com.aronsoft.database.entity.RuangEntity;
import com.aronsoft.database.model.RuangModel;
import com.aronsoft.database.repository.RuangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RuangServiceImpl implements RuangService{

    private RuangRepository repository;

    @Autowired
    public RuangServiceImpl(RuangRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<RuangModel> getAll(){
        List<RuangEntity> result = this.repository.findAll();
        if (result.isEmpty()){
            Collections.emptyList();
        }
        return result.stream().map(RuangModel::new).collect(Collectors.toList());
    }

    @Override
    public RuangModel getById(String id){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new RuangModel();
        }
        Optional<RuangEntity> result = repository.findById(id);
        return result.map(RuangModel::new).orElseGet(RuangModel::new);
    }

    @Override
    public RuangModel save(RuangModel data){
        if (data == null){
            return new RuangModel();
        }
        RuangEntity result = new RuangEntity(data);
        try {
            this.repository.save(result);
            return new RuangModel(result);
        }catch (Exception e){
            return new RuangModel();
        }
    }

    @Override
    public RuangModel update(String id, RuangModel data){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new RuangModel();
        }
        Optional<RuangEntity> result = repository.findById(id);

        if (result.isPresent()){
            RuangEntity ruangData = result.get();
            ruangData.setCode(data.getCode());
            ruangData.setName(data.getName());
            ruangData.setGedungId(data.getGedungId());
            ruangData.setLantaiKe(data.getLantaiKe());
            ruangData.setUpdatedAt(LocalDateTime.now());
            ruangData.setUpdatedBy("SYSTEM");

            try {
                this.repository.save(ruangData);
                return new RuangModel(ruangData);
            }catch (Exception e){
                System.out.println("Error Update: "+e.getMessage());
            }
        }
        return new RuangModel();
    }

    @Override
    public RuangModel delete(String id){
        if (id == null || id.isBlank() || id.isEmpty()){
            return new RuangModel();
        }
        Optional<RuangEntity> result = repository.findById(id);
        if (result.isPresent()){
            RuangEntity ruangData = result.get();
            try {
                this.repository.delete(ruangData);
                return new RuangModel(ruangData);
            }catch (Exception e){
                System.out.println("Error Delete: "+e.getMessage());
            }
        }
        return new RuangModel();
    }
}
