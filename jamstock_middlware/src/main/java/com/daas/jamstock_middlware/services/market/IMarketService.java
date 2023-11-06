package com.daas.jamstock_middlware.services.market;

import com.daas.jamstock_middlware.models.Currency;

import java.util.List;

public interface IMarketService {
    List<Currency> findAllCurrencies();
}
