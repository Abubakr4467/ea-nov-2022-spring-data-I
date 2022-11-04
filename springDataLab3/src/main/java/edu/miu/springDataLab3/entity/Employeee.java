package edu.miu.springDataLab3.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class Employeee {

    @EmbeddedId
    private  EmployeeId id;

    private String gpa;

}
