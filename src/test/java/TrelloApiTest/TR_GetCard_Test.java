package TrelloApiTest;

import Authorization.Authorization;
import BaseUrlTrello.TrelloBaseUrl;
import TestDataForTrello.TestsResponsesController;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
/*
curl --request GET \
  --url 'https://api.trello.com/1/cards/{id}?key=APIKey&token=APIToken' \
  --header 'Accept: application/json'
 */
public class TR_GetCard_Test extends TrelloBaseUrl {
    Authorization authorization=new Authorization();
    TestsResponsesController testsResponsesController=new TestsResponsesController();
    @Test
    public void test(){
        trelloCardTransactionsBaseUrl.pathParam("id","67728582a447f88de2890ca8");
        authorization.putApiKeyAndTokenQueryparamstoBaseUrl(trelloCardTransactionsBaseUrl);
        Response getCard=given().when().spec(trelloCardTransactionsBaseUrl).get("/{id}");
       testsResponsesController.GetResponseBodyCheckandAssert(getCard);
       getCard.prettyPrint();
    }
}
