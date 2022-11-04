package edu.miu.springDataLab3.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class EmployeeId  implements Serializable {
    private String fname;
    private  String lname;
}
