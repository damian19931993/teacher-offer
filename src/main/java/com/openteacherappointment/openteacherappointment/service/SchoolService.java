package com.openteacherappointment.openteacherappointment.service;

import com.openteacherappointment.openteacherappointment.dto.Response;
import com.openteacherappointment.openteacherappointment.dto.SchoolDto;
import com.openteacherappointment.openteacherappointment.entity.School;

public interface SchoolService {

    Response save (SchoolDto school);
}
