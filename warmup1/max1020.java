public int max1020(int a, int b) {
  boolean at = a >= 10 && a <= 20;
  boolean bt = b >= 10 && b <= 20;
  
  if(at != bt) {
    if(at == true) {
      return a;
    } else {
      return b;
    }
  } else if (a < b) {
    return b;
  } else {
    return a;
  }
}
