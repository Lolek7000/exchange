package com.karold.currencyexchange.model;

import java.math.BigDecimal;

public class Currency {

    private String currencyCode;

    private BigDecimal value;

    public Currency(String currencyCode, BigDecimal value) {
        this.currencyCode = currencyCode;
        this.value = value;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currencyCode='" + currencyCode + '\'' +
                ", value=" + value +
                '}';
    }
}
