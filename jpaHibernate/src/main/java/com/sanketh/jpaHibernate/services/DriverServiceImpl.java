package com.sanketh.jpaHibernate.services;

import com.sanketh.jpaHibernate.models.Booking;
import com.sanketh.jpaHibernate.models.Driver;
import com.sanketh.jpaHibernate.repositories.DriverRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService{

    public DriverRepository driverRepository;

    public DriverServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    @Override
    public Driver findDriver(Long id) {
        Optional<Driver> opt = driverRepository.findById(id);
        Driver d = new Driver();
        if(opt.isPresent()) {
            System.out.println("driver class:" + opt.get());
            d = opt.get();
        }
        return d;
    }

    @Override
    public Driver findByIdAndLicenseNumber(Long id, String licenseNumber) {
        Optional<Driver> opt = driverRepository.hqlFindByIdAndLicenseNumber(id,licenseNumber);
        Driver d = new Driver();
        if(opt.isPresent()) {
            d = opt.get();
        }
        List<Booking> bookings = d.getBookings();
        for(Booking b: bookings) {
            System.out.println(b.getId());
        }
        return d;
    }
}
