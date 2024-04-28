package com.sanketh.jpaHibernate.repositories;

import com.sanketh.jpaHibernate.models.Booking;
import com.sanketh.jpaHibernate.models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver,Long> {

    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);

    List<Driver> findAllByIdIn(List<Long> driverIds);
    @Query(nativeQuery = true ,value = "select * from Driver where id=:id AND license_number=:licenseNumber")
    Optional<Driver> rawFindByIdAndLicenseNumner(Long id, String licenseNumber);

    @Query("select d from Driver as d where d.id = :id AND d.licenseNumber=:licenseNumber")
    Optional<Driver> hqlFindByIdAndLicenseNumber(Long id, String licenseNumber);
}
