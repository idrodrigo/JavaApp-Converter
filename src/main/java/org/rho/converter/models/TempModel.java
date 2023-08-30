package org.rho.converter.models;

import org.json.JSONObject;

public class TempModel extends Model {
    public TempModel() {
        super();
    }
    @Override
    protected void populateData() {
        JSONObject data = new JSONObject();
        data.put("CELSIUS", 1);
        data.put("FAHRENHEIT", 1);
        data.put("KELVIN", 1);
        setData(data);
    }
}
