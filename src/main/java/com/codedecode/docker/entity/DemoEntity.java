package com.codedecode.docker.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Id;

import javax.persistence.Entity;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoEntity {
    @Id
    private  int id;
    private String centerName;
    private String centerAddress;


}
