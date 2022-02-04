package cmf.creditcard.issuer.lib;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

class Issuers {

  private static final String ISSUERS_JSON = "src/main/resources/card-issuers.json";
  private static List<IssuerDto> issuers;

  static {
    ObjectMapper mapper = new ObjectMapper();
    try {
      issuers = Arrays.asList(mapper.readValue(new File(ISSUERS_JSON), IssuerDto[].class));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static List<IssuerDto> getIssuers() {
    return issuers;
  }
}
