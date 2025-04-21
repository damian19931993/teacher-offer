package com.openteacherappointment.openteacherappointment.entity;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "district")
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "district")
    private List<School> schools;

    public District() {
    }

    public District(Long id, String name, List<School> schools) {
        this.id = id;
        this.name = name;
        this.schools = schools;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<School> getSchools() {
        return schools;
    }

    public void setSchools(List<School> schools) {
        this.schools = schools;
    }


}
