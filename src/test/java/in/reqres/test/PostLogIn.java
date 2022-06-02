package in.reqres.test;

import in.reqres.model.ReqresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostLogIn extends TestBase {
    @Test
    public void createNewUser(){
        ReqresPojo reqresPogo=new ReqresPojo();
        reqresPogo.setEmail("eve.holt@reqres.in");
        reqresPogo.setPassword("cityslicka");
        Response response=given()
                .header("Content-Type", "application/json")
                .body(reqresPogo)
                .when()
                .post("/login");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
