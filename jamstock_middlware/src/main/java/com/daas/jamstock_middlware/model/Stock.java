package com.daas.jamstock_middlware.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String symbol;
    @OneToOne
    private Currency currency;
    private Double closePrice;
    private Double lastTradePrice;
    private Double priceChange;
//    @ManyToOne
//    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
//    private StockMarket market;
}
