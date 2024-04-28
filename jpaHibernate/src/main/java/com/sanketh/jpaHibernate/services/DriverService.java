package com.sanketh.jpaHibernate.services;


import com.sanketh.jpaHibernate.models.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DriverService {
    public Driver findDriver(Long id);
    public Driver findByIdAndLicenseNumber(Long id, String licenseNumber);

    public String findAllDrivers(List<Long> driverIds);

}
