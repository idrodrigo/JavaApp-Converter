package org.rho.converter.views;

import org.rho.converter.controllers.TempController;

public class TempView extends Section{
    public TempView() {
        super("Temperature", new TempController());
    }
}
