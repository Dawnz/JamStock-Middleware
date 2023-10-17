package com.daas.jamstock_middlware.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "market", orphanRemoval = true, cascade = {CascadeType.ALL})
    private List<Stock> stocks;


}
