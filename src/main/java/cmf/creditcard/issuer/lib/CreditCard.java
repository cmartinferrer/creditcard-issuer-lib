package cmf.creditcard.issuer.lib;

/**
 * @author Cristian Martín Ferrer on 06/01/22.
 */
public class CreditCard {

  private final String cardNumber;

  public CreditCard(final String cardNumber) {
    this.cardNumber = cardNumber.replaceAll("\\s+", "");
  }

  public String getType() {
    return Issuers
        .getIssuerList()
        .stream()
        .filter(cardIssuer -> cardNumber.matches(cardIssuer.getRegex()))
        .findFirst()
        .orElseThrow()
        .getName();
  }

}
