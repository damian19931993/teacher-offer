package com.openteacherappointment.openteacherappointment.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "school")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String address;
    @OneToMany(mappedBy = "school")
    private List<JobOffer> jobOffer;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    private boolean contagiousDisease;
}
