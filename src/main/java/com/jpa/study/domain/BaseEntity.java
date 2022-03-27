package com.jpa.study.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {

    private String createdBy;
    private LocalDateTime createdDate;
    private String lastModifedBy;
    private LocalDateTime lastModifiedDate;
}
