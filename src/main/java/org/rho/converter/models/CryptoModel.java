package org.rho.converter.models;

import org.json.JSONArray;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CryptoModel extends Model{
    public CryptoModel(){
        super();
    }
    @Override
    protected void populateData() {
        JSONArray data = null;
        try {
            URL url = new URL(
                    "http://api.coinlayer.com/live?access_key="
                            + System.getenv("API_KEY_CRYPTO"));
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();


            if (conn.getResponseCode() != 200) {

                throw new Exception("Error al establecer la conexión");
            } else {
                // Continuar con la ejecución del programa
                StringBuilder dataString = new StringBuilder();
                dataString.append("[");
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    dataString.append(scanner.nextLine());
                }
                scanner.close();
                dataString.append("]");
                JSONArray jsonArray = new JSONArray(dataString.toString());
                setData(jsonArray.getJSONObject(0).getJSONObject("rates"));
            }

        } catch (Exception e) {
            setData(null);
        }
    }
}
