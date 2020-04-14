public boolean startHi(String str) {
  if(str.length() < 2) return false;
  
  if(str.length() < 2 && str.equals("hi")) return true;
  
  return str.substring(0, 2).equals("hi");
}
