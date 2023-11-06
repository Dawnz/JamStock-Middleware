package com.daas.jamstock_middlware.controllers;

import com.daas.jamstock_middlware.models.Currency;
import com.daas.jamstock_middlware.services.currency.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CurrenciesController {
//    add the repository
    @Autowired
    ICurrencyService currencyService;

    @QueryMapping
    List<Currency> currencies(){
    return currencyService.findAllCurrencies();
    }
//    @SchemaMapping(typeName = "Mutation", field = "addBook")
//    public String addBook(
//            @Argument String author,
//            @Argument String name,
//            @Argument String publisher,
//            @Argument Double price) {
//        log.info("Saving book, name {}", name);
//        var book = new BookInput(name, author, publisher, price);
//        return bookCatalogService.saveBook(book);
//    }
}
