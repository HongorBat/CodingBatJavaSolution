public int close10(int a, int b) {
  int at = Math.abs(10 - a);
  int bt = Math.abs(10 - b);
  
  if(at == bt){
    return 0;
  } else if( at < bt) {
    return a;
  
  } else {
    return b;
  }
  
}
