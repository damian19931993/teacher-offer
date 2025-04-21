package com.openteacherappointment.openteacherappointment.repository;

import com.openteacherappointment.openteacherappointment.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School, Long> {
}
