package com.javi.domain;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "candidate")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long candidateId;
    private String name;
    private String surname;
    private String identityType;
    private String idNumber;
    private Date birthDate;
    private Technology technology;

    public Candidate() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public void setCandidateId(Long candidateId) {
        this.candidateId = candidateId;
    }

    @Id
    public Long getCandidateId() {
        return candidateId;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", identityType='" + identityType + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", birthDate=" + birthDate +
                ", technology=" + technology +
                '}';
    }
}
