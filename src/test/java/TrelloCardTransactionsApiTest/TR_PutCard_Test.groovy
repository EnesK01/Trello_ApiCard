package TrelloCardTransactionsApiTest

import Authorization.Authorization
import BaseUrlTrello.TrelloBaseUrlForCardTransactions
import TestOutputDataForTrello.TestsResponsesControllerForEachRequestType
import io.restassured.http.ContentType
import io.restassured.response.Response
import org.junit.Test
import static io.restassured.RestAssured.given;

/*
curl --request PUT \
  --url 'https://api.trello.com/1/cards/{id}?key=APIKey&token=APIToken' \
  --header 'Accept: application/json'
 */
class TR_PutCard_Test extends TrelloBaseUrlForCardTransactions {
    Authorization authorization=new Authorization();
    TestsResponsesControllerForEachRequestType testsResponsesControllerForEachRequestType=new TestsResponsesControllerForEachRequestType();
    @Test
    public void test() {
        String[] cardlist=new String[2];
        cardlist[0]="677854a360afb8cc99f51a4e";
        cardlist[1]="677854a4fa06f25b52d87881";
        Random random = new Random();
        int randomIndex = random.nextInt(cardlist.length)
        String randomCard = cardlist[randomIndex];
    trelloCardTransactionsBaseUrl.pathParam("id",randomCard);
        trelloCardTransactionsBaseUrl.queryParam("name","I updated card name");
        authorization.putApiKeyAndTokenQueryparamstoBaseUrl(trelloCardTransactionsBaseUrl);
        Response Updatecard=given().contentType(ContentType.JSON).when().spec(trelloCardTransactionsBaseUrl).put("/{id}");
        testsResponsesControllerForEachRequestType.PutResponseBodyCheckandAssert(Updatecard);


    }
}
