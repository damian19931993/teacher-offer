package com.openteacherappointment.openteacherappointment.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

@Entity
@Table(name = "job_offer")
@Builder
@Getter
public class JobOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;
    private String ige;
    @ManyToOne
    @JoinColumn(name = "area_id")
    private Area area;
    private String level;
    private boolean headInCharge;
    private String course;
    private String shift;
    private String jornada;
    private String jobType;
    private String startingDate;
    private String startOffer;
    private String endOffer;
    private String sinceDate;
    private String untilDate;
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private String saturday;
    private String comments;
}
