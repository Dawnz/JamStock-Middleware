package com.daas.jamstock_middlware.repositories;

import com.daas.jamstock_middlware.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends JpaRepository<Stock, Integer> {

}
