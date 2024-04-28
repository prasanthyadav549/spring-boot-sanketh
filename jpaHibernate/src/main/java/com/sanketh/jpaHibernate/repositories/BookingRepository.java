package com.sanketh.jpaHibernate.repositories;

import com.sanketh.jpaHibernate.models.Booking;
import com.sanketh.jpaHibernate.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Long> {

    List<Booking> findAllByDriverIn(List<Driver> drivers);
}
