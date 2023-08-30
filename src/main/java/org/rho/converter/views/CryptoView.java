package org.rho.converter.views;

import org.rho.converter.controllers.CryptoController;

public class CryptoView extends Section{
    public CryptoView() {
        super("Crypto", new CryptoController());
    }
}
