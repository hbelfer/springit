package com.vega.springit.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Vote  {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private int vote ;
  
}
