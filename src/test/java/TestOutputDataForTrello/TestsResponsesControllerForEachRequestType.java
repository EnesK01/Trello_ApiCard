package TestOutputDataForTrello;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class TestsResponsesControllerForEachRequestType {

//dinamik data süreçleri olmadığı için bazı assertionlar yorum satırına alındı. Bu durum düzeltildiğinde birden fazla assertion type kullanılabilir.
    public void GetResponseBodyCheckandAssert(Response response){
        Assert.assertEquals(response.getStatusCode(),200);

    }
    public void PostResponseBodyCheckandAssert(Response response){
        response.then().assertThat().statusCode(200).body("id",Matchers.notNullValue());


    }
    public void PutResponseBodyCheckandAssert(Response response) {
        response.then().assertThat().statusCode(200);
//        try{
//        SoftAssert softAssert = new SoftAssert();
//
//        softAssert.assertEquals("6771957358bdfeff4fc42b97", newresponse.get("idBoard"));
//        softAssert.assertEquals("67728582a447f88de2890ca8", newresponse.get("id").toString());
//        softAssert.assertAll();
//    }catch(Exception e){
//
//        }
    }
    public void DeleteResponseBodyCheckandAssert(Response response){
        response.then().assertThat().contentType(ContentType.JSON).statusCode(200);
//       try {
//           JsonPath newresponse = response.jsonPath();
//           SoftAssert softAssert = new SoftAssert();
//
//           softAssert.assertEquals("6771957358bdfeff4fc42b97", newresponse.get("idBoard"));
//           softAssert.assertEquals("67728582a447f88de2890ca8", newresponse.get("id").toString());
//           softAssert.assertAll();
//       }catch (Exception e){
//
//       }

    }
}
