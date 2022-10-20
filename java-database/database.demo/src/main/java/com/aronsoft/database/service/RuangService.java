package com.aronsoft.database.service;

import com.aronsoft.database.model.RuangModel;

import java.util.List;

public interface RuangService {
    public List<RuangModel> getAll();
    public RuangModel getById(String id);
    public RuangModel save(RuangModel data);
    public RuangModel update(String id, RuangModel data);
    public RuangModel delete(String id);
}
