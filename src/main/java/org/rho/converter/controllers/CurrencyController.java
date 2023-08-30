package org.rho.converter.controllers;

import org.rho.converter.models.CurrencyModel;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyController extends Controller{
    public CurrencyController() {
        super(new CurrencyModel());
    }
    @Override
    public double convert(String dataFrom, String dataTo, double amount) {
        double from = getData().getDouble(dataFrom);
        double to = getData().getDouble(dataTo);
        double result = (amount/from)*to;
        BigDecimal resultDecimal = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
        return resultDecimal.doubleValue();
    }
}
