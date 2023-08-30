package org.rho.converter.views;

import org.rho.converter.controllers.WeightController;

public class WeightView extends Section {
    public WeightView() {
        super("Weight", new WeightController());
    }
}
