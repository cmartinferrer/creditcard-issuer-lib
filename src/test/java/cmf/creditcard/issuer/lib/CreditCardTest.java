package cmf.creditcard.issuer.lib;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Credit card tests")
class CreditCardTest {

  private static final String MASTERCARD = "MASTERCARD";
  private static final String VISA = "VISA";
  private static final String AMEX = "AMEX";
  private static final String DINERS = "DINERS";
  private static final String DISCOVER = "DISCOVER";
  private static final String ELO = "ELO";
  private static final String HIPERCARD = "HIPERCARD";
  private static final String JCB = "JCB";
  private static final String MAESTRO = "MAESTRO";

  @Nested
  @DisplayName("Given credit card number")
  class GivenCreditCardNumber {

    @Nested
    @DisplayName("When get type")
    class WhenGetType {

      @Test
      void thenReturnAmex() {
        assertAll(
            () -> assertEquals(AMEX, new CreditCard("3700 0000 0000 002").getType()),
            () -> assertEquals(AMEX, new CreditCard("3700 0000 0100 018").getType())
        );
      }

      @Test
      void thenReturnDiners() {
        assertAll(
            () -> assertEquals(DINERS, new CreditCard("3600 6666 3333 44").getType()),
            () -> assertEquals(DINERS, new CreditCard("3607 0500 0010 20").getType())
        );
      }

      @Test
      void thenReturnDiscover() {
        assertAll(
            () -> assertEquals(DISCOVER, new CreditCard("6011 6011 6011 6611").getType()),
            () -> assertEquals(DISCOVER, new CreditCard("6445 6445 6445 6445").getType())
        );
      }

      @Test
      void thenReturnElo() {
        assertEquals(ELO, new CreditCard("5066 9911 1111 1118").getType());
      }

      @Test
      void thenReturnHipercard() {
        assertEquals(HIPERCARD, new CreditCard("6062 8288 8866 6688").getType());
      }

      @Test
      void thenReturnJcb() {
        assertEquals(JCB, new CreditCard("3569 9900 1009 5841").getType());
      }

      @Test
      void thenReturnMaestro() {
        assertEquals(MAESTRO, new CreditCard("6771 7980 2100 0008").getType());
      }

      @Test
      void thenReturnMastercard() {
        assertAll(
            () -> assertEquals(MASTERCARD, new CreditCard("2222 4000 7000 0005").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("5555 3412 4444 1115").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("5577 0000 5577 0004").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("5555 4444 3333 1111").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("2222 4107 4036 0010").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("5555 5555 5555 4444").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("2222 4107 0000 0002").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("2222 4000 1000 0008").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("2223 0000 4841 0010").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("2222 4000 6000 0007").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("2223 5204 4356 0010").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("2222 4000 3000 0004").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("5100 0600 0000 0002").getType()),
            () -> assertEquals(MASTERCARD, new CreditCard("2222 4000 5000 0009").getType())
        );
      }

      @Test
      void thenReturnVisa() {
        assertAll(
            () -> assertEquals(VISA, new CreditCard("4111 1111 4555 1142 ").getType()),
            () -> assertEquals(VISA, new CreditCard("4988 4388 4388 4305").getType()),
            () -> assertEquals(VISA, new CreditCard("4166 6766 6766 6746").getType()),
            () -> assertEquals(VISA, new CreditCard("4646 4646 4646 4644").getType()),
            () -> assertEquals(VISA, new CreditCard("4000 6200 0000 0007").getType()),
            () -> assertEquals(VISA, new CreditCard("4000 0600 0000 0006").getType()),
            () -> assertEquals(VISA, new CreditCard("4293 1891 0000 0008").getType()),
            () -> assertEquals(VISA, new CreditCard("4988 0800 0000 0000").getType()),
            () -> assertEquals(VISA, new CreditCard("4111 1111 1111 1111").getType()),
            () -> assertEquals(VISA, new CreditCard("4444 3333 2222 1111").getType()),
            () -> assertEquals(VISA, new CreditCard("4001 5900 0000 0001").getType()),
            () -> assertEquals(VISA, new CreditCard("4000 1800 0000 0002").getType()),
            () -> assertEquals(VISA, new CreditCard("4000 0200 0000 0000").getType()),
            () -> assertEquals(VISA, new CreditCard("4000 1600 0000 0004").getType()),
            () -> assertEquals(VISA, new CreditCard("4002 6900 0000 0008").getType()),
            () -> assertEquals(VISA, new CreditCard("4400 0000 0000 0008").getType()),
            () -> assertEquals(VISA, new CreditCard("4484 6000 0000 0004").getType()),
            () -> assertEquals(VISA, new CreditCard("4607 0000 0000 0009").getType()),
            () -> assertEquals(VISA, new CreditCard("4977 9494 9494 9497").getType()),
            () -> assertEquals(VISA, new CreditCard("4000 6400 0000 0005").getType()),
            () -> assertEquals(VISA, new CreditCard("4003 5500 0000 0003").getType()),
            () -> assertEquals(VISA, new CreditCard("4000 7600 0000 0001").getType()),
            () -> assertEquals(VISA, new CreditCard("4017 3400 0000 0003").getType()),
            () -> assertEquals(VISA, new CreditCard("4005 5190 0000 0006").getType()),
            () -> assertEquals(VISA, new CreditCard("4131 8400 0000 0003").getType()),
            () -> assertEquals(VISA, new CreditCard("4035 5010 0000 0008").getType()),
            () -> assertEquals(VISA, new CreditCard("4151 5000 0000 0008").getType()),
            () -> assertEquals(VISA, new CreditCard("4571 0000 0000 0001").getType()),
            () -> assertEquals(VISA, new CreditCard("4199 3500 0000 0002").getType())
        );
      }
    }


  }

}
