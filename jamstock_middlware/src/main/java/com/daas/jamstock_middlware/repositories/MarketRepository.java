package com.daas.jamstock_middlware.repositories;

import com.daas.jamstock_middlware.models.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market, Integer> {
}
