package org.rho.converter.models;

import org.json.JSONObject;

public class LengthModel extends Model {
    public LengthModel() {
        super();
    }

    @Override
    protected void populateData() {
        JSONObject data = new JSONObject();
        data.put("CENTIMETERS", 0.393701);
        data.put("METERS", 39.3701);
        data.put("KILOMETERS", 39370.1);
        data.put("FEET", 12.0);
        data.put("YARDS", 36.0);
        data.put("MILES", 63360.0);
        setData(data);
    }
}
