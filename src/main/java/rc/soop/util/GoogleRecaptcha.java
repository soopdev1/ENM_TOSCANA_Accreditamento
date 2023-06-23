/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.soop.util;

import static rc.soop.action.ActionB.getPath;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author srotella
 */
public class GoogleRecaptcha {
    
    public static boolean isValid(String clientRecaptchaResponse) {

        try {

            final String RECAPTCHA_SERVICE_URL = getPath("recaptchasite");
            final String SECRET_KEY = getPath("recaptchasecret");

            if (clientRecaptchaResponse == null || "".equals(clientRecaptchaResponse)) {
                return false;
            }

            URL obj = new URL(RECAPTCHA_SERVICE_URL);
            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

            con.setRequestMethod("POST");
            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

            String postParams
                    = "secret=" + SECRET_KEY
                    + "&response=" + clientRecaptchaResponse;

            con.setDoOutput(true);
            try (DataOutputStream wr = new DataOutputStream(con.getOutputStream())) {
                wr.writeBytes(postParams);
                wr.flush();
            }
            int responseCode = con.getResponseCode();
            StringBuilder response;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()))) {
                String inputLine;
                response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }
//            JSONParser parser = new JSONParser();
//            JSONObject json = (JSONObject) parser.parse(response.toString());
            JSONObject json = new JSONObject(response.toString());
            
//            System.out.println("rc.soop.util.GoogleRecaptcha.isValid() "+json.toString());
            
            Boolean success = (Boolean) json.get("success");
            Double score = (Double) json.get("score");
            boolean ctrl1 = success;
            boolean ctrl2 = score >= 0.5;
            return (ctrl1 && ctrl2);

        } catch (Exception e) {
            return false;
        }
    }
    
}
