package com.daas.jamstock_middlware.repositories;

import com.daas.jamstock_middlware.models.StockMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMarketRepository extends JpaRepository<StockMarket,Integer> {
}
