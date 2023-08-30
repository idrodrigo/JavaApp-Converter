package org.rho.converter.views;

import org.rho.converter.controllers.DataController;

public class DataView extends Section{
    public DataView() {
        super("Data", new DataController());
    }
}
