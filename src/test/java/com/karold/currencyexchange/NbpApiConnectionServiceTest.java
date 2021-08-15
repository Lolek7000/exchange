package com.karold.currencyexchange;

import com.karold.currencyexchange.service.NbpApiConnectionService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.net.http.HttpClient;


public class NbpApiConnectionServiceTest {

    private HttpClient httpClient = HttpClient.newHttpClient();

    private NbpApiConnectionService apiService = new NbpApiConnectionService(httpClient);

    @Test
    public void shouldReturn_CurrencyPriceResponse() {

        this.apiService.getPricesForCurrency("usd");
    }

}
