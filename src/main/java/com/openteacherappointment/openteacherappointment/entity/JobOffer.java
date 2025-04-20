package com.openteacherappointment.openteacherappointment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

@Entity
@Table(name = "job_offer")
@Builder
@Getter
public class JobOffer {

    @Id
    private String id;
    private String school;
    private String ige;
    private String area;
    private String level;
    private String district;
    private String address;
    private boolean headInCharge;
    private String course;
    private String shift;
    private String jornada;
    private String jobType;
    private boolean contagiousDisease;
    private String staring;
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
