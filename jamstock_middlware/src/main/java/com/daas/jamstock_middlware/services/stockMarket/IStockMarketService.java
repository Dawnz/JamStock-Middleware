package com.daas.jamstock_middlware.services.stockMarket;

import com.daas.jamstock_middlware.models.Currency;

import java.util.List;

public interface IStockMarketService {
    List<Currency> findAllCurrencies();
}
