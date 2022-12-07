package test;

import com.codeborne.selenide.logevents.SelenideLogger;
import data.ApiUtils;
import data.Card;
import data.DataGenerator;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class BuyingTripApiTest {

    Card invalidHolderCard = DataGenerator.getInvalidHolderCard();

    @BeforeAll
    static void setUpAll() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterAll
    static void tearDownAll() {
        SelenideLogger.removeListener("allure");
    }

    @Test
    @DisplayName("Should not send request using a valid debit card with invalid cardholder name")
    void shouldNotSendPaymentRequestWithIncorrectName() {
        int statusCode = ApiUtils.getRequestStatusCode(invalidHolderCard, "/api/v1/pay");
        assertNotEquals(200, statusCode);
    }

    @Test
    @DisplayName("Should not send the request for a credit with invalid cardholder name")
    void shouldNotSendCreditRequestWithIncorrectName() {
        int statusCode = ApiUtils.getRequestStatusCode(invalidHolderCard, "/api/v1/credit");
        assertNotEquals(200, statusCode);
    }
}
