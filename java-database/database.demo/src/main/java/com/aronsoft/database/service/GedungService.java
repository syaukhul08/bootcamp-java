package com.aronsoft.database.service;

import com.aronsoft.database.model.GedungModel;

import java.util.List;

public interface GedungService {
    public List<GedungModel> getAll();
    public GedungModel getById(String id);
    public GedungModel save(GedungModel data);
    public GedungModel update(String id, GedungModel data);
    public GedungModel delete(String id);
}
