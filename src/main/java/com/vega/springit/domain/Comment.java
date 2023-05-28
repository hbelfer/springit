package com.vega.springit.domain;

import com.vega.springit.service.BeanUtil;
import lombok.*;
import org.ocpsoft.prettytime.PrettyTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
public class Comment  {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String body;

}
