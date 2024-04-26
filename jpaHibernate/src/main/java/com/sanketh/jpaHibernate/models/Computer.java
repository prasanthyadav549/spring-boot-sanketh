package com.sanketh.jpaHibernate.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "computerId")
public class Computer extends Devices{
    private String os;
}
