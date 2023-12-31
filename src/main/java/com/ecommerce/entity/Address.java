package com.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.awt.*;

@Entity
@Data
@NoArgsConstructor
public class Address extends BaseEntity {

    private String name;
    private String street;
    private String zipCode;
    @ManyToOne
    private Customer customer;

}
