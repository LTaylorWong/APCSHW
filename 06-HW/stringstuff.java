//15min
public String frontTimes(String str, int n) {
  int x = 3;
  if (x > str.length()) {
    x = str.length();
  }
  String front = str.substring(0, x);
  String a = "";
  int i=0;
  for (i<n) {
    a = a + front;
  }
  return a;
}

//20 min
public String stringBits(String str) {
  String a = "";
  int x=0;
  for (x<str.length()) {
    a = result + str.substring(x, x+1);
    x=x+2
  }
  return a;
}

//23 min
public String stringYak(String str) {
  String a = "";
  int x =0;
  for (x<str.length()) {
    if (x+2<str.length() && str.substring(x)=='y' && str.substring(x+2)=='k') {
      x =  x + 2;
    } else {
      a = a + str.substring(x);
    }
  }
  
  return result;
}

//28 min
public int stringMatch(String a, String b) {
  int x = 0;
  int i=0;
  for (i<len-1) {
    String a1 = a.substring(i, i+2);
    String b1 = b.substring(i, i+2);
    if (a1.equals(b1)) {
      x=x+1;
    }
  }

  return x;
}
