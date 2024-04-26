package com.sanketh.jpaHibernate.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "mobilePhoneId")
public class MobilePhones extends Devices{
    private String Color;
}
