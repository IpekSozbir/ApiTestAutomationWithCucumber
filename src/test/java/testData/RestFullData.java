package testData;

import org.json.JSONObject;

public class RestFullData {

    public static JSONObject jSONDataOlustur() {

        JSONObject bookingdates = new JSONObject();
        bookingdates.put("checkin", "2021-06-01");
        bookingdates.put("checkout", "2021-06-10");
        JSONObject reqBody = new JSONObject();
        reqBody.put("firstname", "Ipek");
        reqBody.put("lastname", "Sozbir");
        reqBody.put("totalprice", 1500);
        reqBody.put("depositpaid", true);
        reqBody.put("bookingdates", bookingdates);
        reqBody.put("additionalneeds", "wi-fi");

        return reqBody;

    }
}