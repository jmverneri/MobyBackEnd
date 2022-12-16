package com.javi.service;

import com.javi.entity.Candidate;
import com.javi.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository repository;

    public List<Candidate> listCandidates(){
        return repository.findAll();
    }

    public void saveCandidate(Candidate candidate){
        repository.save(candidate);
    }

    public Candidate fetchCandidateById(Integer id){
        return repository.findById(id).get();
    }

    public void deleteCandidate(Integer id){
        repository.deleteById(id);
    }
}
