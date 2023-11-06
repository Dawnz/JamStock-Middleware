package com.daas.jamstock_middlware.services.stockMarket;

import com.daas.jamstock_middlware.models.Currency;
import com.daas.jamstock_middlware.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockMarketService implements IStockMarketService {
    @Autowired
    CurrencyRepository currencyRepository;

    @Override
    public List<Currency> findAllCurrencies(){
        return currencyRepository.findAll();
    }
}
