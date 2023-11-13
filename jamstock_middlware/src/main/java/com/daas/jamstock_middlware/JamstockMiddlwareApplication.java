package com.daas.jamstock_middlware;

import com.daas.jamstock_middlware.models.Currency;
import com.daas.jamstock_middlware.models.Market;
import com.daas.jamstock_middlware.models.StockMarket;
import com.daas.jamstock_middlware.repositories.CurrencyRepository;
import com.daas.jamstock_middlware.repositories.MarketRepository;
import com.daas.jamstock_middlware.repositories.StockMarketRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class JamstockMiddlwareApplication {

	public static void main(String[] args) {
		SpringApplication.run(JamstockMiddlwareApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(CurrencyRepository currencyRepository, MarketRepository marketRepository, StockMarketRepository stockMarketRepository){
		return args -> {
			Currency currency = currencyRepository.save(new Currency(1,"JMD"));
			Currency currency2 = currencyRepository.save(new Currency(2,"USD"));
//			markets
			Market market = marketRepository.save(new Market(3,"Junior Market",new ArrayList<>()));
			Market market2 = marketRepository.save(new Market(4,"Main Market",new ArrayList<>()));
//			Market Type
			StockMarket stockMarket = stockMarketRepository.save(new StockMarket(5,market));
			StockMarket stockMarket2 = stockMarketRepository.save(new StockMarket(6,market2));
		};
	}
}
