package com.daas.jamstock_middlware.services.stockMarket;

import com.daas.jamstock_middlware.models.StockMarket;
import com.daas.jamstock_middlware.repositories.StockMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockMarketService implements IStockMarketService {
    @Autowired
    StockMarketRepository stockMarketRepository;

    @Override
    public List<StockMarket> findAllStockMarkets(){
        return stockMarketRepository.findAll();
    }
}
