package com.openteacherappointment.openteacherappointment.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "area")
    private List<JobOffer> jobOffer;
}
