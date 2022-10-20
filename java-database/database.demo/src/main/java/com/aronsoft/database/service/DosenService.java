package com.aronsoft.database.service;

import com.aronsoft.database.model.DosenModel;

import java.util.List;

public interface DosenService {
    public List<DosenModel> getAll();
    public DosenModel getById(String id);
    public DosenModel save(DosenModel data);
    public DosenModel update(String id, DosenModel data);
    public DosenModel delete(String id);
}
