package edu.miu.springDataLab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    private int id;
    private String name;



    //uniderectional

//    @JoinColumn(name = "id_category")
//    @OneToMany
//    List<Product> products;


    //biodirectional

    //A Category can have many Products.


    @OneToMany(mappedBy = "category")
    List<Product> products;

}
