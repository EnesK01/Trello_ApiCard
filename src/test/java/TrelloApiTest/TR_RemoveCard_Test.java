package TrelloApiTest;

import Authorization.Authorization;
import BaseUrlTrello.TrelloBaseUrl;
import TestDataForTrello.TestsResponsesController;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
/*
curl --request DELETE \
  --url 'https://api.trello.com/1/cards/{id}?key=APIKey&token=APIToken'

 */
public class TR_RemoveCard_Test extends TrelloBaseUrl {
     Authorization authorization=new Authorization();
     TestsResponsesController testsResponsesController=new TestsResponsesController();
     @Test
    public void test01(){
         trelloCardTransactionsBaseUrl.pathParam("id","677291d4c3619d09d19ec5d6");
         authorization.putApiKeyAndTokenQueryparamstoBaseUrl(trelloCardTransactionsBaseUrl);
         Response deleteCard=given().when().spec(trelloCardTransactionsBaseUrl).delete("/{id}");

     }
}
