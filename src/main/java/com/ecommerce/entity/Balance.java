package com.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@NoArgsConstructor
@Data
@Table(name = "balance")
public class Balance extends BaseEntity{

    private BigDecimal amount;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Customer customer;

}
