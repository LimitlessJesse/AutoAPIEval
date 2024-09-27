NumberFormat usCurrency = NumberFormat.getCurrencyInstance(Locale.US);
String usFormattedNumber = usCurrency.format(number);
System.out.println(usFormattedNumber);
