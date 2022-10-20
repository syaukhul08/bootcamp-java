package com.aronsoft.database.service;


import com.aronsoft.database.model.JurusanModel;

import java.util.List;

public interface JurusanService {
    public List<JurusanModel> getAll();
    public JurusanModel getById(String id);
    public JurusanModel save(JurusanModel data);
    public JurusanModel update(String id, JurusanModel data);
    public JurusanModel delete(String id);

}
