package com.project.airsample.airEgo.Classes.Economy;

import com.project.airsample.airEgo.Enums.Currency;

public class ExchangeRate {
    private float unit;
    private Currency currency;


    public ExchangeRate(float unit, Currency currency){
        this.currency = currency;
        this.unit = unit;
    }

    public float ConvertTo(Currency convertCurrency){
        CurrencyRates dailyRate = new CurrencyRates();
        float calculatedValue = this.unit * dailyRate.getValue(convertCurrency);
        ExchangeRate converted = new ExchangeRate(calculatedValue, convertCurrency);
        return converted.unit;

    }
}
