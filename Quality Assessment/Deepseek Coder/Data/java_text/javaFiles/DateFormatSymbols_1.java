DateFormatSymbols dfs = new DateFormatSymbols(Locale.FRENCH);
String[] months = dfs.getMonths();
System.out.println(Arrays.toString(months));
