package com.karold.currencyexchange.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyPricesResponse {

    private String currency;

    private String code;

    private List<Rate> rates;

    public CurrencyPricesResponse() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public BigDecimal getBid(){
        return this.rates.get(0).getBid();
    }

    public BigDecimal getAsk(){
        return this.rates.get(0).getAsk();
    }
}
