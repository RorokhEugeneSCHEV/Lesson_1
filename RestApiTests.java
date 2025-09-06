package com.example.tests;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RestApiTests {

    private final String baseUrl = "https://postman-echo.com";

    @BeforeAll
    public static void setup() {
        RestAssured.baseURI = "https://postman-echo.com"; 
    }

    @Test
    public void testGetMethod() {
        given()
            .when().get("/get")      
            .then()
            .assertThat()
            .statusCode(200)         
            .body("args", equalTo(null))     
            .body("headers.host", equalTo("postman-echo.com")) 
            .body("url", equalTo(baseUrl + "/get"));          
    }

    @Test
    public void testPostMethod() {
        String payload = "{\"name\": \"John\", \"age\": 30}";

        given()
            .contentType("application/json")              
            .body(payload)                                 
            .when().post("/post")                         
            .then()
            .assertThat()
            .statusCode(200)                              
            .body("json.name", equalTo("John"))         
            .body("json.age", equalTo(30));               
    }

    @Test
    public void testPutMethod() {
        String payload = "{\"id\": 1, \"title\": \"Updated Title\"}";

        given()
            .contentType("application/json")                 
            .body(payload)                                    
            .when().put("/put")                             
            .then()
            .assertThat()
            .statusCode(200)                               
            .body("json.id", equalTo(1))                     
            .body("json.title", equalTo("Updated Title")); 
    }

    @Test
    public void testDeleteMethod() {
        given()
            .when().delete("/delete")                      
            .then()
            .assertThat()
            .statusCode(200)                                 
            .body("data", empty());                          
    }

    @Test
    public void testPatchMethod() {
        String payload = "{\"email\": \"john@example.com\"}";

        given()
            .contentType("application/json")                  
            .body(payload)                                    
            .when().patch("/patch")                           
            .then()
            .assertThat()
            .statusCode(200)                                  
            .body("json.email", equalTo("john@example.com")); 
    }
}