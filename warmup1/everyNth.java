public String everyNth(String str, int n) {
  String res = "";
  int div = n;
  for(int i = 0; i < str.length(); i += n){
    res = res + String.valueOf(str.charAt(i));
  }
  
  return res;
}
