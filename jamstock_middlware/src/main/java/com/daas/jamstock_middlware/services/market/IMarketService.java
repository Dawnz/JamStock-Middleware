package com.daas.jamstock_middlware.services.market;

import com.daas.jamstock_middlware.models.Market;

import java.util.List;

public interface IMarketService {
    List<Market> findAllMarkets();
}
