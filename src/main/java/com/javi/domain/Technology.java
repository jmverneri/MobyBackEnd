package com.javi.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "technology")
public class Technology {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long technologyId;
    private String name;
    private String version;

    public Technology() {
    }

    public Long getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Long technologyId) {
        this.technologyId = technologyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Technology{" +
                "technologyId=" + technologyId +
                ", name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
