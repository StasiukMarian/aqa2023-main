package testPackage.lesson10restassuredpojo;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;

public class TestClass {
    public static final String BASE_URL = "https://reqres.in/";

    @Test
    public void getUsers() {
        Specifications.getSpecifications(Specifications.requestSpecification(BASE_URL), Specifications.responseSpecification(200));
        List<UserData> data = given()
                .when()
                .get("api/users?page=2")
                .then()
                .extract().body().jsonPath().getList("data", UserData.class);

        List<String> avatars = new ArrayList<>();
        List<String> ids = new ArrayList<>();

        Assert.assertNotNull(data);

        for (UserData datum : data) {

            Assert.assertTrue(datum.getAvatar().contains(datum.getId().toString()));
            Assert.assertTrue(datum.getEmail().contains("@reqres.in"));
            avatars.add(datum.getAvatar());
            ids.add(datum.getId().toString());
        }
        for (int i = 0; i < avatars.size(); i++) {
            Assert.assertTrue(avatars.get(i).contains(ids.get(i)));
        }
        System.out.println(avatars);
    }

    @Test
    public void createUser() {
        Specifications.getSpecifications(Specifications.requestSpecification(BASE_URL), Specifications.responseSpecification(201));
        CreateUserRequest rq = new CreateUserRequest();
        rq.setName("morpheus");
        rq.setJob("leader");
        CreateUserResponse response = given()
                .body(rq)
                .when().post("api/users")
                .then().log().all().
                extract().as(CreateUserResponse.class);

        Assert.assertEquals(response.getName(), rq.getName());
    }

    @Test
    public void register() {
        Specifications.getSpecifications(Specifications.requestSpecification(BASE_URL), Specifications.responseSpecification(200));
        int id = 4;
        String token = "QpwL5tke4Pnpja7X4";
        RegisterRequest user = new RegisterRequest("eve.holt@reqres.in", "pistol");
        RegisterResponse response = given()
                .body(user)
                .when().post("api/register")
                .then().extract().as(RegisterResponse.class);
        Assert.assertEquals(Integer.toString(id), response.getId().toString());
        Assert.assertEquals(token, response.getToken());
    }

    @Test
    public void updateUser() {
        Specifications.getSpecifications(Specifications.requestSpecification(BASE_URL), Specifications.responseSpecification(200));
        UpdateUserRequest user = new UpdateUserRequest("morpheus", "zion resident");

        UpdateUserResponse response = given()
                .body(user)
                .when()
                .put("api/users/2")
                .then().log().all()
                .extract().as(UpdateUserResponse.class);
        Assert.assertEquals(user.getName(),response.getName());
    }
}
