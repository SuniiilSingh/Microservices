package com.sun.cc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
public class CurrencyConversionController {
@Autowired
private CurrencyConversionService currencyConversionService;


    @RequestMapping(value = "/currency-converter/from/{from}/to/{to}/quantity/{quantity}",method = RequestMethod.GET)
    public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
                                                  @PathVariable BigDecimal quantity) {

      return currencyConversionService.convertCurrency(from,to,quantity);
    }


    @RequestMapping(value = "/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}",method = RequestMethod.GET)
    public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
                                                       @PathVariable BigDecimal quantity) {

        return currencyConversionService.convertCurrencyByFeign(from,to,quantity);
    }

}
