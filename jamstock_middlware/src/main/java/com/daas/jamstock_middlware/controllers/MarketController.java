package com.daas.jamstock_middlware.controllers;


import com.daas.jamstock_middlware.models.Market;
import com.daas.jamstock_middlware.services.market.IMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MarketController {
//    add the repository
    @Autowired
    IMarketService marketService;

    @QueryMapping
    List<Market> markets(){
    return marketService.findAllMarkets();
    }

}
