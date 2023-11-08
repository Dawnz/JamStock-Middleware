package com.daas.jamstock_middlware;

import com.daas.jamstock_middlware.models.Currency;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JamstockMiddlwareApplication {

	public static void main(String[] args) {
		SpringApplication.run(JamstockMiddlwareApplication.class, args);
	}

//	@Bean
//	ApplicationRunner applicationRunner(CurrencyRepository currencyRepository){
//		return args -> {
//			Currency currency = currencyRepository.save(new Currency(1,"JMD"));
//			Currency currency2 = currencyRepository.save(new Currency(2,"USD"));
//		};
//	}
}
