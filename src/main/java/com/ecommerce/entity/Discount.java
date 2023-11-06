package com.ecommerce.entity;

import com.ecommerce.enums.DiscountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Discount extends BaseEntity{

    private BigDecimal discount;
    @Enumerated(EnumType.STRING)
    private DiscountType discount_type;
    private String name;

}
