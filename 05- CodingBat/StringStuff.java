public String nonStart(String a, String b) {
  String a_end = a.substring(1,a.length());
  String b_end = b.substring(1,b.length());
  return a_end+b_end;
}

public String makeAbba(String a, String b) {
 return a+b+b+a; 
}

public int diff21(int n) {
  if (n<=21)
  {
      return 21-n;
  }  else {
      return (n-21)*2;
  }
}
