package TrelloApiTest;

import Authorization.Authorization;
import BaseUrlTrello.TrelloBaseUrl;
import TestDataForTrello.TestsResponsesController;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
/*
curl --request POST \
  --url 'https://api.trello.com/1/cards?idList=5abbe4b7ddc1b351ef961414&key=APIKey&token=APIToken' \
  --header 'Accept: application/json'
 */
public class TR_PostCard_Test extends TrelloBaseUrl {
    Authorization authorization=new Authorization();
    TestsResponsesController testsResponsesController=new TestsResponsesController();
    @Test
    public void test(){

        trelloCardTransactionsBaseUrl.queryParam("idList","6771957358bdfeff4fc42b9e");
        authorization.putApiKeyAndTokenQueryparamstoBaseUrl(trelloCardTransactionsBaseUrl);
        trelloCardTransactionsBaseUrl.queryParam("name","this is a fourth card");
        Response createCard=given().contentType(ContentType.JSON).spec(trelloCardTransactionsBaseUrl).header("Accept", "application/json").post();
        testsResponsesController.PostResponseBodyCheckandAssert(createCard);

    }
}
