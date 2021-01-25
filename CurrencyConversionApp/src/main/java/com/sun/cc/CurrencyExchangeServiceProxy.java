package com.sun.cc;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name="forex-service")
@RibbonClient(name="forex-service")
public interface CurrencyExchangeServiceProxy {

    @RequestMapping(value = "/currency-exchange/from/{from}/to/{to}",method = RequestMethod.GET)
    public CurrencyConversionBean retrieveExchangeValue
            (@PathVariable("from") String from, @PathVariable("to") String to);
}
