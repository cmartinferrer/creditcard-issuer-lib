# Credit card issuer recovery
Utility program to help you recovery credit card issuer.

### Usage
Compile the project using Maven
```
mvn clean package
```

Add dependency in your project
```
<dependency>
  <groupId>cmf.creditcard.issuer.lib</groupId>
  <artifactId>creditcard-issuer-lib</artifactId>
  <version>1.0</version>
<dependency>
```

Use it!
```
CreditCard card = new CreditCard("3700 0000 0000 002");
String issuer = card.getType();
```
<br>

### Regular expressions 

Below are the regex used to retrieve credit card issuers:

- **VISA**
```
^4[0-9]{12}(?:[0-9]{3})?$
```
- **MASTERCARD**
```
^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$
```
- **AMEX**
```
^3[47][0-9]{13}$
```
- **DINERS**
```
^3(?:0[0-5]|[68][0-9])[0-9]{11}$
```
- **DISCOVERY**
```
^65[4-9][0-9]{13}|64[4-9][0-9]{13}|6011[0-9]{12}|(622(?:12[6-9]|1[3-9][0-9]|[2-8][0-9][0-9]|9[01][0-9]|92[0-5])[0-9]{10})$
```
- **JCB**
```
^(?:2131|1800|35\d{3})\d{11}$
```
- **MAESTRO**
```
^(5018|5020|5038|5893|6304|6759|6761|6762|6763|6771)[0-9]{8,15}$
```
- **ELO**
```
^(?:40117[8-9]|431274|438935|451416|457393|45763[1-2]|504175|627780|636297|636368|65500[0-1]|65165[2-4]|65048[5-8]|506699|5067[0-6]\d|50677[0-8]|509\d{3})\d{10}$
```
- **HIPERCARD**
```
^(606282\d{10}(\d{3})?)|(3841\d{15})$
```

<br>

### Reference docs
[Payment Card Number](https://en.wikipedia.org/wiki/Payment_card_number)

<br>

### Disclaimer
Use this piece of software under your own responsibility.