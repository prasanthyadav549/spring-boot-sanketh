package com.sanketh.jpaHibernate.models;

import jakarta.persistence.*;
import org.hibernate.boot.jaxb.internal.InputStreamXmlSource;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Devices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;

    private String name;
}
