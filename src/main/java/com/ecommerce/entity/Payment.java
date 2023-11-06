package com.ecommerce.entity;

import com.ecommerce.enums.PaymentMethod;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Payment extends BaseEntity{

    private BigDecimal paid_price;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;


}
