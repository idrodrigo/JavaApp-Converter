package org.rho.converter.controllers;

import org.rho.converter.models.LengthModel;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LengthController extends Controller {
    public LengthController() {
        super(new LengthModel());
    }

    @Override
    public double convert(String dataFrom, String dataTo, double amount) {
        double conversionFactor = getData().getDouble(dataFrom) / getData().getDouble(dataTo);
        double result = amount * conversionFactor;
        BigDecimal resultDecimal = new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
        return resultDecimal.doubleValue();
    }
}
