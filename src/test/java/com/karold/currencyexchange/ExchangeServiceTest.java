package com.karold.currencyexchange;

import com.karold.currencyexchange.model.Currency;
import com.karold.currencyexchange.service.ExchangeService;
import com.karold.currencyexchange.service.NbpApiConnectionService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.net.http.HttpClient;

public class ExchangeServiceTest {

    private HttpClient httpClient = HttpClient.newHttpClient();

    private NbpApiConnectionService apiService = new NbpApiConnectionService(httpClient);

    private ExchangeService exchangeService = new ExchangeService(apiService);

    @Test
    public void shouldReturn_Currency(){
        Currency result  = exchangeService.exchange("USD", "CAD", new BigDecimal(100));
        System.out.println(result.toString());
    }
}
