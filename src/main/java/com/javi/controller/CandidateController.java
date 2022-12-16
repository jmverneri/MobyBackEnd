package com.javi.controller;

import com.javi.domain.Candidate;
import com.javi.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/candidates")
    public List<Candidate> listCandidates(){
        return candidateService.listCandidates();
    }
}
