package com.plexsupply.api;

import com.plexsupply.BaseTest;
import com.plexsupply.utils.Config;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class ApiTests {

    @Test
    @Description("Verify base API response")
    public void testHealthCheck() {
        given()
            .baseUri(Config.getBaseUrl())
            .when()
            .get("/customer/section/load/?sections=cart")
            .then()
            .statusCode(200);
    }
}
