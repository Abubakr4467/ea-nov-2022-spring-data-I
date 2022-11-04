package edu.miu.springDataLab3.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Review {

    @Id
    private int id ;
    private String comment;

    //uniderectional
    //******************


    //biodirectional
    //    A Review can only belong to one  Product

    @ManyToOne
    @JoinColumn(name = "id_product")
    private Product product;



    //    A Review can only belong to one   User
    //    @JoinColumn(name = "id_user")
    //    @ManyToOne
    //    private User user;



    //Create User and Review mapping with Join Column
    //baseicly we user @JoinColumn on week side
    @JoinColumn
    @ManyToOne
    private User user;


}
