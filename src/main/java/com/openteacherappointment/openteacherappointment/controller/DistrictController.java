package com.openteacherappointment.openteacherappointment.controller;

import com.openteacherappointment.openteacherappointment.dto.Response;
import com.openteacherappointment.openteacherappointment.entity.District;
import com.openteacherappointment.openteacherappointment.service.DistrictService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.ref.PhantomReference;

@RestController
@RequestMapping("/api/districts")
public class DistrictController {

    private final DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @PostMapping("/{name}/save")
    public ResponseEntity<Response> save(@PathVariable String name) {
        District district = districtService.saveDistrict(name);
        Response response = new Response();
        response.setCode("0");
        response.setDescription("OK");
        return ResponseEntity.ok(response);
    }
}
