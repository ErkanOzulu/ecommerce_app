package com.ecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
@Entity
public class Customer extends BaseEntity {

    private String email;
    private String firstName;
    private String lastName;
    private String userName;
    @OneToOne(mappedBy = "customer")
    private Balance balance;

}
