package com.daas.jamstock_middlware.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date datePublished;
//    @ManyToOne
//    private Stock relatedStock;
//    TODO. update this for file upload
    private String document;


}
