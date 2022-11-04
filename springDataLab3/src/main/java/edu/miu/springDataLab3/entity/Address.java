package edu.miu.springDataLab3.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    private int id;
    private String street;
    private String city;
    private int zip;



    //uniderectional

    //    @JoinColumn(name = "id_user")
    //    @OneToOne
    //    private  User user;


    //*******************


//    @JoinColumn(name = "id_user")
//    @OneToOne
//    private  User user;



    @JoinColumn(name = "id_user")
    @OneToOne
    private  User user;

}
