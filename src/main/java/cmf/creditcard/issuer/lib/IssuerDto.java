package cmf.creditcard.issuer.lib;

class IssuerDto {

  private String name;
  private String regex;

  public IssuerDto() {
  }

  public IssuerDto(String name, String regex) {
    this.name = name;
    this.regex = regex;
  }

  public String getName() {
    return name;
  }

  public String getRegex() {
    return regex;
  }

}
