package com.daas.jamstock_middlware.services.currency;

import com.daas.jamstock_middlware.models.Currency;

import java.util.List;

public interface ICurrencyService {
    List<Currency> findAllCurrencies();
}
