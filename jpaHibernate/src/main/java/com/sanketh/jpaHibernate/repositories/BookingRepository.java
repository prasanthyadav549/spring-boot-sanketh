package com.sanketh.jpaHibernate.repositories;

import com.sanketh.jpaHibernate.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
