package com.ecommerce.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Category extends BaseEntity {

    private String name;

}
