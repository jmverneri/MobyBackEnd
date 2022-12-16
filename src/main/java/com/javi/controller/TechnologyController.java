package com.javi.controller;

import com.javi.entity.Candidate;
import com.javi.entity.Technology;
import com.javi.service.CandidateService;
import com.javi.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class TechnologyController {
    @Autowired
    private TechnologyService technologyService;

    @GetMapping("/technologies")
    public List<Technology> listTechnologies(){
        return technologyService.listTechnologies();
    }

}
