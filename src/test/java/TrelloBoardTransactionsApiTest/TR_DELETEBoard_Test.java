package TrelloBoardTransactionsApiTest;

import Authorization.Authorization;
import BaseUrlTrello.TrelloBaseUrlForBoardTransactions;
import TestOutputDataForTrello.TestsResponsesControllerForEachRequestType;
import com.beust.ah.A;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/*
6777e5a5e58ab326fbe9c98e
curl --request DELETE \
  --url 'https://api.trello.com/1/boards/{id}?key=APIKey&token=APIToken'
 */
public class TR_DELETEBoard_Test extends TrelloBaseUrlForBoardTransactions {
    Authorization authorization=new Authorization();
    TR_POSTBoard_Test tr_postBoard_test=new TR_POSTBoard_Test();
    TestsResponsesControllerForEachRequestType testsResponsesControllerForEachRequestType=new TestsResponsesControllerForEachRequestType();
    @Test
    public void DeleteRequest(){
        boardMainurlRequest.pathParam("id","6778548555089b04d74f51d9");
        authorization.putApiKeyAndTokenQueryparamstoBaseUrl(boardMainurlRequest);
        Response response=given().contentType(ContentType.JSON).when().spec(boardMainurlRequest).delete("/{id}");
        testsResponsesControllerForEachRequestType.DeleteResponseBodyCheckandAssert(response);

    }
}
