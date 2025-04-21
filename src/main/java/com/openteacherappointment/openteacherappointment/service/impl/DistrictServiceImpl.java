package com.openteacherappointment.openteacherappointment.service.impl;

import com.openteacherappointment.openteacherappointment.entity.District;
import com.openteacherappointment.openteacherappointment.repository.DistrictRepository;
import com.openteacherappointment.openteacherappointment.service.DistrictService;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl implements DistrictService {

    private final DistrictRepository districtRepository;

    public DistrictServiceImpl(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    @Override
    public District saveDistrict(String name) {
        District district = new District();
        district.setName(name);
        return districtRepository.save(district);
    }
}
