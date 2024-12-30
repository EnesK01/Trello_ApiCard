package TestDataForTrello;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestsResponsesController {


    public void GetResponseBodyCheckandAssert(Response response){
        Assert.assertEquals(response.getStatusCode(),200);

    }
    public void PostResponseBodyCheckandAssert(Response response){
        response.then().assertThat().statusCode(200)
        .body("id", Matchers.notNullValue())
        .body("idList",Matchers.is("6771957358bdfeff4fc42b9e"));

    }
    public void PutResponseBodyCheckandAssert(Response response){
        JsonPath newresponse=response.jsonPath();
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals("6771957358bdfeff4fc42b97",newresponse.get("idBoard"));
        softAssert.assertEquals("67728582a447f88de2890ca8",newresponse.get("id").toString());
        softAssert.assertAll();

    }
    public void DeleteResponseBodyCheckandAssert(Response response){
        JsonPath newresponse=response.jsonPath();
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals("6771957358bdfeff4fc42b97",newresponse.get("idBoard"));
        softAssert.assertEquals("67728582a447f88de2890ca8",newresponse.get("id").toString());
        softAssert.assertAll();

    }
}
