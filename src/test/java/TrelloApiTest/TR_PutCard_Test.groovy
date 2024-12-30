package TrelloApiTest

import Authorization.Authorization
import BaseUrlTrello.TrelloBaseUrl
import TestDataForTrello.TestsResponsesController
import io.restassured.http.ContentType
import io.restassured.response.Response
import org.junit.Test
import static io.restassured.RestAssured.given;

/*
curl --request PUT \
  --url 'https://api.trello.com/1/cards/{id}?key=APIKey&token=APIToken' \
  --header 'Accept: application/json'
 */
class TR_PutCard_Test extends TrelloBaseUrl {
    Authorization authorization=new Authorization();
    TestsResponsesController testsResponsesController=new TestsResponsesController();
    @Test
    public void test() {
    trelloCardTransactionsBaseUrl.pathParam("id","67728582a447f88de2890ca8");
        authorization.putApiKeyAndTokenQueryparamstoBaseUrl(trelloCardTransactionsBaseUrl);
        Response Updatecard=given().contentType(ContentType.JSON).when().spec(trelloCardTransactionsBaseUrl).put("/{id}");
       testsResponsesController.PutResponseBodyCheckandAssert(Updatecard);

    }
}
