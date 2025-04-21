package com.openteacherappointment.openteacherappointment.service.impl;

import com.openteacherappointment.openteacherappointment.dto.Response;
import com.openteacherappointment.openteacherappointment.dto.SchoolDto;
import com.openteacherappointment.openteacherappointment.repository.SchoolRepository;
import com.openteacherappointment.openteacherappointment.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolServiceImpl(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @Override
    public Response save(SchoolDto school) {
        return null;
    }
}
