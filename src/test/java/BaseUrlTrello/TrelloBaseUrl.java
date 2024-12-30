package BaseUrlTrello;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

;

public class TrelloBaseUrl {
    protected RequestSpecification trelloCardTransactionsBaseUrl;

    @Before
    public void setupBaseUrl() {
        trelloCardTransactionsBaseUrl = new RequestSpecBuilder()
                .setBaseUri("https://api.trello.com/1/cards")
                .build();
    }
}
