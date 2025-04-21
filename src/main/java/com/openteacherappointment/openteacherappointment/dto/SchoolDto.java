package com.openteacherappointment.openteacherappointment.dto;

import com.openteacherappointment.openteacherappointment.entity.District;
import com.openteacherappointment.openteacherappointment.entity.JobOffer;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class SchoolDto {

    private String number;
    private String address;
    @OneToMany(mappedBy = "school")
    private List<JobOffer> jobOffer;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private District district;
    private boolean contagiousDisease;
}
