package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;

import java.util.HashMap;
import java.util.List;

public class VirginGamesSteps {

    public List<HashMap<String,Object>> getAllDataByEndPoint(String currency){
        return SerenityRest.given().log().all()
                .queryParam("currency",currency)
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_DATA_BINGO)
                .then().statusCode(200)
                .extract().path("data.pots.currency");

    }


}
