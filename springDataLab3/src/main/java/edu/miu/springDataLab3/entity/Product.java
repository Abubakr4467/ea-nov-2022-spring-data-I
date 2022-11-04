package edu.miu.springDataLab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {

    @Id
    private int id;
    private String name;
    private double price;
    private String rating;


    //uniderectional

    //    @JoinColumn   // reviews_id  by default
    //    @JoinColumn(name = "id_product")
    //    @OneToMany
    //    List<Review> reviews;


    //********************

    //biodirectional


    //A Product can belong to only one Category.
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;



    //A Product can have many Reviews.
    @OneToMany(mappedBy = "product")
    List<Review> reviews;






}

