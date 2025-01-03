package TrelloCardTransactionsApiTest;

import Authorization.Authorization;
import BaseUrlTrello.TrelloBaseUrlForCardTransactions;
import TestOutputDataForTrello.TestsResponsesControllerForEachRequestType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
/*
curl --request DELETE \
  --url 'https://api.trello.com/1/cards/{id}?key=APIKey&token=APIToken'

 */
public class TR_RemoveCard_Test extends TrelloBaseUrlForCardTransactions {
     Authorization authorization=new Authorization();
     TestsResponsesControllerForEachRequestType testsResponsesControllerForEachRequestType =new TestsResponsesControllerForEachRequestType();
     @Test
    public void test01(){
         String[] cardlist=new String[2];
         cardlist[0]="677854b671717f80a8d5b03e";
         cardlist[1]="677854b7a6691892b0bd072b";
         trelloCardTransactionsBaseUrl.pathParam("id",cardlist[0]);
         authorization.putApiKeyAndTokenQueryparamstoBaseUrl(trelloCardTransactionsBaseUrl);
         Response deleteCard=given().when().spec(trelloCardTransactionsBaseUrl).delete("/{id}");
         trelloCardTransactionsBaseUrl.pathParam("id",cardlist[1]);
         Response deleteSecondCard=given().when().spec(trelloCardTransactionsBaseUrl).delete("/{id}");

     }
}
