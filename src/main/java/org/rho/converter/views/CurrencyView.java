package org.rho.converter.views;

import org.rho.converter.controllers.CurrencyController;

public class CurrencyView extends Section{
    public CurrencyView() {
        super("Currency", new CurrencyController());
    }
}
