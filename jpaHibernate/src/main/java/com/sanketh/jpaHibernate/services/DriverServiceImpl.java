package com.sanketh.jpaHibernate.services;

import com.sanketh.jpaHibernate.models.Booking;
import com.sanketh.jpaHibernate.models.Driver;
import com.sanketh.jpaHibernate.repositories.BookingRepository;
import com.sanketh.jpaHibernate.repositories.DriverRepository;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class DriverServiceImpl implements DriverService{

    private DriverRepository driverRepository;
    private BookingRepository bookingRepository;

//    public DriverServiceImpl(DriverRepository driverRepository, BookingRepository bookingRepository) {
//        this.driverRepository = driverRepository;
//        this.bookingRepository = bookingRepository;
//    }

    public DriverServiceImpl(DriverRepository driverRepository) {

        this.driverRepository = driverRepository;
    }

    @Override
    public Driver findDriver(Long id) {
        Optional<Driver> dList = driverRepository.findById(id);
//        Driver d = new Driver();
//        if(opt.isPresent()) {
//            System.out.println("driver class:" + opt.get());
//            d = opt.get();
//        }
        return dList.get();
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

    @Override
    public String findAllDrivers(List<Long> driverIds) {
        List<Driver> drivers = driverRepository.findAllByIdIn(driverIds);
        for(Driver driver: drivers) {
            List<Booking> bookings = driver.getBookings();
            bookings.forEach(booking -> System.out.println(booking.getId()));
        }
        return "Success";
    }


}
