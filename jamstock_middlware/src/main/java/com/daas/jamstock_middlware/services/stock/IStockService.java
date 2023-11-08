package com.daas.jamstock_middlware.services.stock;

import com.daas.jamstock_middlware.models.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> findAllStocks();
}
