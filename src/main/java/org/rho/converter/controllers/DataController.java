package org.rho.converter.controllers;

import org.rho.converter.models.DataModel;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DataController extends Controller{
    public DataController( ) {
        super(new DataModel());
    }

    @Override
    public double convert(String dataFrom, String dataTo, double amount) {
        double conversionFactor = getData().getDouble(dataFrom) / getData().getDouble(dataTo);
        double result = amount * conversionFactor;
        BigDecimal resultDecimal = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
        return resultDecimal.doubleValue();
    }
}
