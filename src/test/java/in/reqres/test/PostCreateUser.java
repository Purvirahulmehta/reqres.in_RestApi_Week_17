package in.reqres.test;

import in.reqres.model.ReqresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostCreateUser extends TestBase {
    @Test
    public void createNewUser(){
        ReqresPojo reqresPogo=new ReqresPojo();
        reqresPogo.setJob("Gardener");
        reqresPogo.setName("Bojo");
        Response response=given()
                .header("Content-Type", "application/json")
                .body(reqresPogo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();


    }
}
