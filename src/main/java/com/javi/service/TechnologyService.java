package com.javi.service;

import com.javi.entity.Technology;
import com.javi.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TechnologyService {
    @Autowired
    private TechnologyRepository repository;

    public List<Technology> listTechnologies(){
        return repository.findAll();
    }

    public void saveTechnology(Technology technology){
        repository.save(technology);
    }

    public Technology fetchTechnologyById(Integer id){
        return repository.findById(id).get();
    }

    public void deleteTechnology(Integer id){
        repository.deleteById(id);
    }
}
