public String missingChar(String str, int n) {
  if( n == 0 ) return str.substring (1, str.length());
  
  return str.substring(0, n) + str.substring(n+1, str.length());
}
