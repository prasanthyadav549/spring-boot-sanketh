package com.sanketh.jpaHibernate.controllers;

import com.sanketh.jpaHibernate.models.Driver;
import com.sanketh.jpaHibernate.services.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DriverController {
    private DriverService driverService;

    public DriverController(DriverService driverService) {
        this.driverService = driverService;
    }

    @PostMapping("/")
    public ResponseEntity<?> getDriver() {
        Driver d = driverService.findDriver(1L);
        return new ResponseEntity<>(d, HttpStatus.ACCEPTED);
    }

    @GetMapping("/")
    public ResponseEntity<?> getDriverByLicenseNumber() {
        Driver d = driverService.findByIdAndLicenseNumber(1L, "DT1234");
        return new ResponseEntity<>(d, HttpStatus.ACCEPTED);
    }

}
