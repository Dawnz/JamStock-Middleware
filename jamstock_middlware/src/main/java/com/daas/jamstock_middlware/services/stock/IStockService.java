package com.daas.jamstock_middlware.services.stock;

import com.daas.jamstock_middlware.models.Currency;

import java.util.List;

public interface IStockService {
    List<Currency> findAllCurrencies();
}
