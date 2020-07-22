package prova.itau.controller;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

/**
 * Classe ProvaTest.
 *
 * @author Dennis Morelo
 *
 */
@QuarkusTest
public class ProvaControllerTest {

    /**
     * Método get.
     *
     */
    @Test
    public void list() {
        given()
          .when().get("/prova-itau")
          .then()
             .statusCode(200)
             .body(is("[]"));
    }
    
    /**
     * Método get.
     *
     */
    @Test
    public void get() {
    	String uuid = "507f1f77bcf86cd799439011";
        given()
          .pathParam("id", uuid)
          .when().get("/prova-itau/{id}")
          .then()
            .statusCode(200)
            .body(is("{}"));
    }

}