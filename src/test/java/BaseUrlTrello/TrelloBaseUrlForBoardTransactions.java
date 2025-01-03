package BaseUrlTrello;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeSuite;

/*curl --request GET \
        --url 'https://api.trello.com/1/boards/{id}?key=APIKey&token=APIToken' \
        --header 'Accept: application/json'

 */
public class TrelloBaseUrlForBoardTransactions {
    protected RequestSpecification boardMainurlRequest;

    @BeforeSuite
    public void setBaseurl(){
        boardMainurlRequest=new RequestSpecBuilder()
                .setBaseUri("https://api.trello.com/1/boards").build();
    }
}
