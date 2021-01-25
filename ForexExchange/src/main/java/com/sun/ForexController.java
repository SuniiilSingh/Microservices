package com.sun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {
    @Autowired
    private ForexService forexService;



    @RequestMapping(value = "/currency-exchange/from/{from}/to/{to}",method = RequestMethod.GET)
    public ExchangeValue retrieveExchangeValue
            (@PathVariable String from, @PathVariable String to){

       return forexService.getExchangeValue(from,to);
    }


}
