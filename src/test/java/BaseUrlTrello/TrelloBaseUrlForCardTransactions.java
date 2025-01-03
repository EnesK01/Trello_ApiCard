package BaseUrlTrello;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.testng.annotations.BeforeSuite;

;

public class TrelloBaseUrlForCardTransactions {
    protected RequestSpecification trelloCardTransactionsBaseUrl;

    @Before
    public void setupBaseUrl() {
        trelloCardTransactionsBaseUrl = new RequestSpecBuilder()
                .setBaseUri("https://api.trello.com/1/cards")
                .build();
    }
}
