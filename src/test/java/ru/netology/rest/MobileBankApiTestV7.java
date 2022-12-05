package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class MobileBankApiTestV7 {

        @Test
        public  void should(){
            given()
                    .baseUri("https://postman-echo.com")
                    .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                    .when()
                    .post("/post")
// Проверки
                    .then()
                    .statusCode(200)
                    .body("/post", equalTo("some data"))
            ;
        }
}
