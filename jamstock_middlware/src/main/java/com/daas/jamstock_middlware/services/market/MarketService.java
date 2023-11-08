package com.daas.jamstock_middlware.services.market;

import com.daas.jamstock_middlware.models.Market;
import com.daas.jamstock_middlware.repositories.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarketService implements IMarketService {
    @Autowired
    MarketRepository marketRepository;

    @Override
    public List<Market> findAllMarkets(){
        return marketRepository.findAll();
    }
}
