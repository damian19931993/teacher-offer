package com.openteacherappointment.openteacherappointment.repository;

import com.openteacherappointment.openteacherappointment.entity.JobOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobOfferRepository extends JpaRepository<JobOffer, Long> {
}
