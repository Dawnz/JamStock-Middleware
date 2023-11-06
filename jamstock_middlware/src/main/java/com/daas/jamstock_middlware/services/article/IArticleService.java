package com.daas.jamstock_middlware.services.article;

import com.daas.jamstock_middlware.models.Currency;

import java.util.List;

public interface IArticleService {
    List<Currency> findAllCurrencies();
}
