package edu.miu.springDataLab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table(name = "UserTable")
@Entity
@Data
public class User {
    @Id
    private int id;
    private String email;
    private String password;
    private String fname;
    private String lname;


    //uniderectional

    //    @JoinColumn(name = "id_user")
    //    @OneToMany
    //    List<Review> reviews;

    //*******************


    //biodirectional

    //    @OneToMany(mappedBy = "user" )

    //Create User and Review mapping with Join Table.
    //      @JoinTable(name = "habibi")  // waht is benefit  it still created 3rd table


    @OneToMany(mappedBy = "user")
    List<Review> reviews;



    //    @OneToOne(mappedBy = "user")
    //    private Address address;


    //    Create User and Address mapping with Join Table.

//    @JoinTable   non sense to put it here , there is no 3rd table in OTO


    @OneToOne(mappedBy = "user")
    private Address address;



}
