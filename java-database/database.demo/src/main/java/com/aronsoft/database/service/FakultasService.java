package com.aronsoft.database.service;

import com.aronsoft.database.model.DosenModel;
import com.aronsoft.database.model.FakultasModel;

import java.util.List;

public interface FakultasService {
    public List<FakultasModel> getAll();
    public FakultasModel getById(String id);
    FakultasModel save(FakultasModel data);
    FakultasModel update(String id, FakultasModel data);
    public FakultasModel delete(String id);
}
