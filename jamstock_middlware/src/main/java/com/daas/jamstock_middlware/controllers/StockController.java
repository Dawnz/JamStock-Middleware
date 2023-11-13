package com.daas.jamstock_middlware.controllers;

import com.daas.jamstock_middlware.models.Currency;
import com.daas.jamstock_middlware.models.Stock;
import com.daas.jamstock_middlware.services.currency.ICurrencyService;
import com.daas.jamstock_middlware.services.stock.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class StockController {
//    add the repository
    @Autowired
IStockService stockService;

    @QueryMapping
    List<Stock> stocks(){
    return stockService.findAllStocks();
    }

}
