package com.daas.jamstock_middlware.controllers;

import com.daas.jamstock_middlware.models.Currency;
import com.daas.jamstock_middlware.models.StockMarket;
import com.daas.jamstock_middlware.services.currency.ICurrencyService;
import com.daas.jamstock_middlware.services.stockMarket.IStockMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StockMarketController {
//    add the repository
    @Autowired
    IStockMarketService stockMarketService;

    @QueryMapping
    List<StockMarket> stockMarkets(){
    return stockMarketService.findAllStockMarkets();
    }

}
