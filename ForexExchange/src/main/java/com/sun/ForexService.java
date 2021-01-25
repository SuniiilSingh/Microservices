package com.sun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ForexService {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository repository;




    public ExchangeValue getExchangeValue(String from, String to) {
        ExchangeValue exchangeValue =
                repository.findByFromAndTo(from, to);
        exchangeValue.setPort(
                Integer.parseInt(environment.getProperty("local.server.port")));

        return exchangeValue;
    }


}
