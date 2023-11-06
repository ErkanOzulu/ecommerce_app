package com.ecommerce.entity;

import com.ecommerce.enums.CartState;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cart extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private CartState cart_state;
    @ManyToOne
    private Discount discount;
    @ManyToOne
    private Customer customer;

   }
