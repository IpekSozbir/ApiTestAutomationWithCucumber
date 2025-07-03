package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Assert;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class JphStepdefinitions {
    String endPoint;
    Response response;
    JsonPath responseJP;
    JSONObject request;


    @Given("Kullanici {string} base url'ini kullanir")
    public void kullanici_base_url_ini_kullanir(String string) {
        endPoint = ConfigReader.getProperty("jPHBaseUrl");

    }


    @Then("Path parametreleri icin {string} kullanir")
    public void path_parametreleri_icin_kullanir(String pathParams) {
        endPoint = endPoint + "/" + pathParams;

    }


    @Then("jPH server'a GET request gonderir ve testleri yapmak icin response degerini kaydeder")
    public void j_ph_server_a_get_request_gonderir_ve_testleri_yapmak_icin_response_degerini_kaydeder() {
        response= given().when().get(endPoint);

    }


    @Then("jPH response'da status degerinin {int}")
    public void j_ph_response_da_status_degerinin(Integer statusCode) {
        Assert.assertEquals(statusCode,(Integer)response.statusCode());

    }


    @Then("jPH response'da content type degerinin {string}")
    public void j_ph_response_da_content_type_degerinin(String contentType) {
        Assert.assertEquals(contentType,response.contentType());

    }


    @Then("jPH GET response body'sinde {string} dgerinin Integer {int}")
    public void j_ph_get_response_body_sinde_dgerinin_integer(String attribute, Integer expectedValue) {
        // Then jPH GET response body'sinde "userId" dgerinin Integer 5
        responseJP = response.jsonPath();
        Assert.assertEquals(expectedValue,(Integer) responseJP.getInt(attribute));

    }


    @Then("jPH GET respons body'sinde {string} degerinin String {string}")
    public void j_ph_get_respons_body_sinde_degerinin_string(String attribute, String expectedValue) {
        // And jPH GET respons body'sinde "title" degerinin String "optio dolor molestias sit"
        responseJP =response.jsonPath();
        Assert.assertEquals(expectedValue,responseJP.getString(attribute));

    }




    @Then("Post request icin {string},{string},{int} {int} bilgiler ile request body olusturur")
    public void post_request_icin_bilgiler_ile_request_body_olusturur(String string, String string2, Integer int1, Integer int2) {
        request = new JSONObject();
        request.put("title","Ipek");
        request.put("body","Sozbir");
        request.put("userId",10);
        request.put("id",70);
    }


    @And("jPH server'a POST request gonderir ve testleri yapmak icin response degerini kaydeder")
    public void jphServerAPOSTRequestGonderirVeTestleriYapmakIcinResponseDegeriniKaydeder() {
        response = given().contentType(ContentType.JSON).when().body(request.toString()).post(endPoint);
    }


    @And("jPH response'daki {string} header degerinin {string}")
    public void jphResponseDakiHeaderDegerinin(String headerAttribute, String attributeValue) {
        // And jPH respons daki "Connection" header degerinin "keep-alive"
        Assert.assertEquals(attributeValue,response.header(headerAttribute));
    }



    @Then("response attributelerindeki degerlerin {string},{string},{int} {int}")
    public void response_attributelerindeki_degerlerin(String title, String body, Integer userId, Integer id) {
        // Then response attributelerindeki degerlerin "Ipek","Sozbir",10 70
        responseJP = response.jsonPath();
        Assert.assertEquals(title,responseJP.getString("title"));
        Assert.assertEquals(body,responseJP.getString("body"));
        Assert.assertEquals(userId,(Integer)responseJP.getInt("userId"));
        Assert.assertEquals(id,(Integer)responseJP.getInt("id"));
    }


}
