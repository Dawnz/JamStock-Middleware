package com.daas.jamstock_middlware.services.stock;

import com.daas.jamstock_middlware.models.Stock;
import com.daas.jamstock_middlware.repositories.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService implements IStockService {
    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> findAllStocks(){
        return stockRepository.findAll();
    }
}
