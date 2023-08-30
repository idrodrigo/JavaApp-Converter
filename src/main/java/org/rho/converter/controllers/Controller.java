package org.rho.converter.controllers;

import org.json.JSONObject;
import org.rho.converter.models.Model;

public abstract class Controller {
    private JSONObject data;
    private Model model;
    public Controller(Model model) {
        this.model = model;
        this.data = model.getData();
    }
    public Model getModel() {
        return model;
    }
    public void setModel(Model model) {
        this.model = model;
    }
    public JSONObject getData() {
        return data;
    }
    public void setData(JSONObject data) {
        this.data = data;
    }
    public abstract double convert(String from, String to, double amount);
}
