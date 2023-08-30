package org.rho.converter.models;

import org.json.JSONObject;

public class WeightModel extends Model {
    public WeightModel() {
        super();
    }
    @Override
    protected void populateData() {
        JSONObject data = new JSONObject();
        data.put("GRAMS", 1.0);
        data.put("KILOGRAMS", 1000.0);
        data.put("TONS", 1000000.0);
        data.put("POUNDS", 453.592);
        data.put("OUNCES", 28.3495);
        setData(data);
    }
}
