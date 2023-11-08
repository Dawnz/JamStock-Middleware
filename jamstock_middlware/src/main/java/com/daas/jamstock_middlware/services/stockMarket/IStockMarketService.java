package com.daas.jamstock_middlware.services.stockMarket;

import com.daas.jamstock_middlware.models.StockMarket;

import java.util.List;

public interface IStockMarketService {
    List<StockMarket> findAllStockMarkets();
}
