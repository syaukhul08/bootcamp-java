package com.aronsoft.database.service;

import com.aronsoft.database.entity.DosenEntity;
import com.aronsoft.database.model.DosenModel;
import com.aronsoft.database.repository.DosenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DosenServiceImpl implements DosenService{
    private DosenRepository repository;

    @Autowired
    public DosenServiceImpl(DosenRepository repository){
        this.repository = repository;
    }

    @Override
    public List<DosenModel> getAll(){
        List<DosenEntity> result = this.repository.findAll();
        if (result.isEmpty()){
            Collections.emptyList();
        }
        //conver dari List<DosenEntity> --> List<DosenModel>
        return result.stream().map(DosenModel::new).collect(Collectors.toList());
    }

    @Override
    public DosenModel getById(String id){
        //check id
        if (id == null || id.isBlank() || id.isEmpty()){
            return new DosenModel();
        }
        Optional<DosenEntity> result = repository.findById(id);
        //conver dari <DosenEntity> --> DosenModel
        return result.map(DosenModel::new).orElseGet(DosenModel::new);
    }

    @Override
    public DosenModel save(DosenModel data){
        if (data == null){
            return new DosenModel();
        }
        DosenEntity result = new DosenEntity(data);
        try {
            //proses simpan data --> tabel dosen
            this.repository.save(result);
            return new DosenModel(result);
        }catch (Exception e){
            return new DosenModel();
        }
    }

    @Override
    public DosenModel update(String id, DosenModel data){
        //check id
        if (id == null || id.isBlank() || id.isEmpty()){
            return new DosenModel();
        }

        //ambil data dari table
        Optional<DosenEntity> result = repository.findById(id);
        //check data dari result
        if (result.isPresent()){
            DosenEntity dosenData = result.get();
            //replace data lama dengan dataBaru
            dosenData.setNip(data.getNip());
            dosenData.setName(data.getName());
            dosenData.setJk(data.getJk());
            dosenData.setAlamat(data.getAlamat());
            dosenData.setGelar(data.getGelar());
            //update waktu
            dosenData.setUpdatedAt(LocalDateTime.now());
            dosenData.setUpdatedBy("SYSTEM");

            try {
                this.repository.save(dosenData);
                //jika berhasil
                return new DosenModel(dosenData);
            }catch (Exception e){
                System.out.println("Error update: "+e.getMessage());
            }
        }
        return new DosenModel();
    }

    @Override
    public DosenModel delete(String id){
        //check id
        if (id == null || id.isBlank() || id.isEmpty()){
            return new DosenModel();
        }
        //ambil data dari table
        Optional<DosenEntity> result = repository.findById(id);
        //check data dari result
        if (result.isPresent()){
            try {
                DosenEntity dosenData = result.get();
                this.repository.delete(dosenData);
                //jika delete berhasil
                return new DosenModel(dosenData);
            }catch (Exception e){
                System.out.println("Error delete: "+e.getMessage());
            }
        }
        return new DosenModel();
    }



}
