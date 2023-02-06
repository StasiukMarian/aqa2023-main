package testPackage.lesson9restassured;

import  org.json.simple.JSONObject;
import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class RestTest {
    @Test
    public void test(){

//        __________________________________GET__________________________________
//        Response response = RestAssured.get("https://reqres.in/api/users?page=2");
//        System.out.println(response.getStatusCode());
//        System.out.println(response.asString());
//        System.out.println(response.getBody().asString());
//        given()
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//                .statusCode(200)
//                .log().body();
//
//        given()
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//                .statusCode(200)
//                .body("data.id[1]" , equalTo(8));

//        Response response = given()
//                .contentType(ContentType.JSON)
//                .when()
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//                .extract().response();
//
//        Assert.assertEquals(200, response.statusCode());
//        Assert.assertEquals("Michael", response.jsonPath().getString("data.first_name[0]"));

//        __________________________________POST__________________________________

//        Map<String,Object> map = new HashMap<>();
//        map.put("name", "morpheus");
//        map.put("job", "leader");

        JSONObject request = new JSONObject();
        request.put("name", "morpheus");
        request.put("job", "leader");
//
//        given()
//                .header("Content-Type" , "application/json")
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .body(request.toJSONString())
//                .when()
//                .post("https://reqres.in/api/users")
//                .then()
//                .statusCode(201).log().all();

////______________________________PUT___________________________________
//        given()
//                .header("Content-Type" , "application/json")
//                .contentType(ContentType.JSON)
//                .accept(ContentType.JSON)
//                .body(request.toJSONString())
//                .when()
//                .put("https://reqres.in/api/users/2")
//                .then()
//                .statusCode(200).log().all();

//_____________________________DELETE___________________________________
//        when()
//                .delete("https://reqres.in/api/users/2")
//                .then()
//                .statusCode(204).log().all();
    }
}
